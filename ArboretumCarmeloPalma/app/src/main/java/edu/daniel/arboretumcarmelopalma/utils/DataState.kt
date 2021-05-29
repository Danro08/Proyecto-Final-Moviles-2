package edu.daniel.arboretumcarmelopalma.utils

import edu.daniel.arboretumcarmelopalma.Model.Arbol
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val Arbol: List<Arbol>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}