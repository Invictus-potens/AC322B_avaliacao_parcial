package com.example.gamenews.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gamenews.databinding.ItemNoticiaBinding
import com.example.gamenews.model.Noticia

class NoticiaAdapter(
    private val noticias: List<Noticia>,
    private val onNoticiaClick: (Noticia) -> Unit,
) : RecyclerView.Adapter<NoticiaAdapter.NoticiaViewHolder>() {

    class NoticiaViewHolder(val binding: ItemNoticiaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val binding = ItemNoticiaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoticiaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val noticia = noticias[position]
        with(holder.binding) {
            textoCategoria.text = noticia.categoria
            textoTitulo.text = noticia.titulo
            textoResumo.text = noticia.resumo
            textoData.text = noticia.dataPublicacao
            root.setOnClickListener { onNoticiaClick(noticia) }
        }
    }

    override fun getItemCount(): Int = noticias.size
}
