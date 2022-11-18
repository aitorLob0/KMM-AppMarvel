package ar.edu.unlam.tallerapp

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue


internal class CharactersServiceTest{
    @Test
    fun queSeOrdenenCorrectamenteMedianteSort(){
        val listaEsperada = listOf(
            Character(1,"julian","abc","jkj"),
            Character(2,"pablo","bcd","pojloj"),
            Character(3,"juan","cde","jnkjl"),
            Character(6,"agustin","","lknkjn"),
            Character(5,"cristian","","oijoihjo"),
            Character(4,"karen","","kjhiuhi"),
        )
        val listaAOrdenar = listOf(
            Character(4,"karen","","kjhiuhi"),
            Character(5,"cristian","","oijoihjo"),
            Character(6,"agustin","","lknkjn"),
            Character(3,"juan","cde","jnkjl"),
            Character(2,"pablo","bcd","pojloj"),
            Character(1,"julian","abc","jkj"),
        )
        val listaOrdenada=listaAOrdenar.sortedWith(CharactersService.CharacterComparator())
        listaOrdenada.forEach {
            print(it.toString())
        }
        assertTrue(listaEsperada.compare(listaOrdenada))
    }
}

