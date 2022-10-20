package ar.edu.unlam.tallerapp.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ar.edu.unlam.tallerapp.CharactersService

class CharactersViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       // val characterRepository = CharacterRepositoryClient()
        val charactersService = CharactersService()
        return CharactersViewModel(charactersService) as T
    }
}