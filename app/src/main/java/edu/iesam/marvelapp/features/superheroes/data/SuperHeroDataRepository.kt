package edu.iesam.marvelapp.features.superheroes.data

import edu.iesam.marvelapp.features.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import edu.iesam.marvelapp.features.superheroes.domain.SuperHero
import edu.iesam.marvelapp.features.superheroes.domain.SuperHeroRepository

/**
 * Clase encargada de gestionar la fuente de datos: xml, base de datos, API, etc.
 */
class SuperHeroDataRepository(private val xmlLocalDataSource: SuperHeroXmlLocalDataSource) :
    SuperHeroRepository {

    override fun getAll(): List<SuperHero> {
        return listOf(SuperHero("0", "SuperWoman", "super-woman", "https://"))
        //return xmlLocalDataSource.findAll()
    }
}