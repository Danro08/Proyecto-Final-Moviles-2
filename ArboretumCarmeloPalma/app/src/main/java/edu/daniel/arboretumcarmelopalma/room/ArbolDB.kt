package edu.daniel.arboretumcarmelopalma.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ArbolCacheEntity::class], version = 1)
abstract class ArbolDB : RoomDatabase() {
    companion object{
        val DATABASE_NAME = "ArbolDB"
    }
    abstract fun ArbolDao(): ArbolDao
}