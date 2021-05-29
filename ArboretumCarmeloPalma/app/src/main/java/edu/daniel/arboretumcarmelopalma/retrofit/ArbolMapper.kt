package edu.daniel.arboretumcarmelopalma.retrofit
import edu.daniel.arboretumcarmelopalma.Model.Arbol
import edu.daniel.arboretumcarmelopalma.utils.EntityMapper
import javax.inject.Inject

class ArbolMapper
@Inject
constructor():
EntityMapper<ArbolNetworkEntity, Arbol> {
    override fun mapFromEntity(entity: ArbolNetworkEntity): Arbol {
        return Arbol(
            id = entity.id,
            name = entity.name,
            familia = entity.familia,
            genero = entity.genero,
            floracion = entity.floracion,
            ubicacion = entity.ubicacion,
        )
    }
    override fun mapToEntity(domainModel: Arbol): ArbolNetworkEntity {
        return ArbolNetworkEntity(
            id = domainModel.id,
            name = domainModel.name,
            familia = domainModel.familia,
            genero = domainModel.genero,
            floracion = domainModel.floracion,
            ubicacion = domainModel.ubicacion,
        )
    }
    fun mapFromEntityList(entities: List<ArbolNetworkEntity>): List<Arbol>{
        return entities.map { mapFromEntity(it) }
    }
}