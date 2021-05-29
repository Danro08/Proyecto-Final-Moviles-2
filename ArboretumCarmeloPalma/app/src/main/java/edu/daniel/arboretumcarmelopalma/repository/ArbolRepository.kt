package edu.daniel.arboretumcarmelopalma.repository

import edu.daniel.arboretumcarmelopalma.retrofit.ArbolMapper
import edu.daniel.arboretumcarmelopalma.retrofit.ArbolRetrofit
import edu.daniel.arboretumcarmelopalma.room.ArbolDao
import edu.daniel.arboretumcarmelopalma.room.ArbolCacheMapper
import edu.daniel.arboretumcarmelopalma.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DArbolRepository constructor(
    private val ArbolDao: ArbolDao,
    private val ArbolRetrofit: ArbolRetrofit,
    private val cacheMapper: ArbolCacheMapper,
    private val networkMapper: ArbolMapper
){
    suspend fun getarbol(): Flow<DataState> = flow {
        emit(DataState.Error(java.lang.Exception("error custom")))
        delay(5000)
        try {
            val ArbolData = ArbolRetrofit.get_arbol()
            val ArbolMap = networkMapper.mapFromEntityList(ArbolData)
            for (tempArbol in ArbolMap){
                ArbolDao.insert(cacheMapper.mapToEntity(tempArbol))
            }
            val ArbolCache = ArbolDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(ArbolCache)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}