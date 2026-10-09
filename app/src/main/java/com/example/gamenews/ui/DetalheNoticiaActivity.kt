package com.example.gamenews.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gamenews.R
import com.example.gamenews.data.NoticiasMock
import com.example.gamenews.databinding.ActivityDetalheNoticiaBinding
import com.example.gamenews.model.Noticia

class DetalheNoticiaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheNoticiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheNoticiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.titulo_detalhe)

        val noticiaId = intent.getIntExtra(EXTRA_NOTICIA_ID, ID_INVALIDO)
        val noticia = NoticiasMock.buscarPorId(noticiaId)

        if (noticia == null) {
            Toast.makeText(this, R.string.noticia_nao_encontrada, Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        exibirNoticia(noticia)
    }

    private fun exibirNoticia(noticia: Noticia) {
        with(binding) {
            textoCategoria.text = noticia.categoria
            textoTitulo.text = noticia.titulo
            textoData.text = noticia.dataPublicacao
            textoConteudo.text = noticia.conteudo
            textoAutor.text = noticia.autor?.let { getString(R.string.autor_formato, it) }
                ?: getString(R.string.autor_desconhecido)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    companion object {
        const val EXTRA_NOTICIA_ID = "extra_noticia_id"
        private const val ID_INVALIDO = -1
    }
}
