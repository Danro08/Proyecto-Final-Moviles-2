package edu.daniel.arboretumcarmelopalma.room

import edu.daniel.arboretumcarmelopalma.Model.Arbol
import edu.daniel.arboretumcarmelopalma.retrofit.ArbolNetworkEntity
import edu.daniel.arboretumcarmelopalma.utils.EntityMapper
import javax.inject.Inject

class ArbolCacheMapper
@Inject
constructor():
    EntityMapper<ArbolCacheEntity, Arbol> {
    override fun mapFromEntity(entity: ArbolCacheEntity): Arbol {
        return Arbol(
            id = entity.id,
            name = entity.name,
            familia = entity.familia,
            genero = entity.genero,
            floracion = entity.floracion,
            ubicacion = entity.ubicacion,
        )
    }

    override fun mapToEntity(domainModel: Arbol): ArbolCacheEntity {
        return ArbolCacheEntity(
            id = domainModel.id,
            name = domainModel.name,
            familia = domainModel.familia,
            genero = domainModel.genero,
            floracion = domainModel.floracion,
            ubicacion = domainModel.ubicacion,
        )
    }

    fun mapFromEntityList(entities: List<ArbolCacheEntity>): List<Arbol>{
        return entities.map { mapFromEntity(it) }
    }
}