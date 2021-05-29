package edu.daniel.arboretumcarmelopalma.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ArbolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(arbolEntity: ArbolCacheEntity): Long
    @Query("select * from arbol")
    suspend fun get(): List<ArbolCacheEntity>
}