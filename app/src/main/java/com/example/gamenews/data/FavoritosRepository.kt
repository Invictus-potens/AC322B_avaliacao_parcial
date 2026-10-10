package com.example.gamenews.data

object FavoritosRepository {

    private val favoritos = mutableSetOf<Int>()

    fun isFavorito(noticiaId: Int): Boolean = favoritos.contains(noticiaId)

    fun alternar(noticiaId: Int): Boolean {
        val passaASerFavorito = !favoritos.remove(noticiaId)
        if (passaASerFavorito) favoritos.add(noticiaId)
        return passaASerFavorito
    }
}
