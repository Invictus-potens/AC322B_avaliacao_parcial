package com.example.gamenews.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gamenews.data.NoticiasMock
import com.example.gamenews.databinding.FragmentListaNoticiasBinding

class ListaNoticiasFragment : Fragment() {

    private var _binding: FragmentListaNoticiasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentListaNoticiasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listaNoticias.adapter = NoticiaAdapter(NoticiasMock.noticias) { noticia ->
            val intent = Intent(requireContext(), DetalheNoticiaActivity::class.java)
            intent.putExtra(DetalheNoticiaActivity.EXTRA_NOTICIA_ID, noticia.id)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        binding.listaNoticias.adapter = null
        _binding = null
        super.onDestroyView()
    }
}
