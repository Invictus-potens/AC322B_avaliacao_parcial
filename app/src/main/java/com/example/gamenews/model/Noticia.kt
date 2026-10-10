package com.example.gamenews.model

data class Noticia(
    val id: Int,
    val titulo: String,
    val resumo: String,
    val conteudo: String,
    val categoria: String,
    val dataPublicacao: String,
    val autor: String? = null,
    val imagemResId: Int? = null,
)
