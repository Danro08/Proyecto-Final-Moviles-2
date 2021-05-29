package edu.daniel.arboretumcarmelopalma.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName =  "Arbol")
class ArbolCacheEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "familia")
    var familia: String,

    @ColumnInfo(name = "genero")
    var genero: String,

    @ColumnInfo(name = "floracion")
    var floracion: String,

    @ColumnInfo(name = "ubicacion")
    var ubicacion: String,
)
