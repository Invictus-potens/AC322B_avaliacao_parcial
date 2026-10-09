package com.example.gamenews.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamenews.data.NoticiasMock
import com.example.gamenews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listaNoticias.adapter = NoticiaAdapter(NoticiasMock.noticias) { noticia ->
            val intent = Intent(this, DetalheNoticiaActivity::class.java)
            intent.putExtra(DetalheNoticiaActivity.EXTRA_NOTICIA_ID, noticia.id)
            startActivity(intent)
        }
    }
}
