package com.example.gamenews.ui.componentes

import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageButton
import com.example.gamenews.R
import com.example.gamenews.data.FavoritosRepository

/**
 * Componente XML reutilizável (componente_favorito.xml), inflado dinamicamente
 * tanto no item da lista quanto na tela de detalhe de uma notícia.
 */
object FavoritoComponente {

    fun inflarEm(container: FrameLayout): ImageButton {
        val botao = LayoutInflater.from(container.context)
            .inflate(R.layout.componente_favorito, container, false) as ImageButton
        container.removeAllViews()
        container.addView(botao)
        return botao
    }

    fun configurar(botao: ImageButton, noticiaId: Int) {
        atualizarIcone(botao, FavoritosRepository.isFavorito(noticiaId))
        botao.setOnClickListener {
            val favorito = FavoritosRepository.alternar(noticiaId)
            atualizarIcone(botao, favorito)
        }
    }

    private fun atualizarIcone(botao: ImageButton, favorito: Boolean) {
        botao.setImageResource(
            if (favorito) R.drawable.ic_estrela_preenchida else R.drawable.ic_estrela_contorno
        )
        botao.contentDescription = botao.context.getString(
            if (favorito) R.string.remover_favorito else R.string.adicionar_favorito
        )
    }
}
