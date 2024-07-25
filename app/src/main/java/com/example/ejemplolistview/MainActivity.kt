package com.example.ejemplolistview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejemplolistview.adapter.ListViewAdapter
import com.example.ejemplolistview.clases.Elemento
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val listView : ListView;

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val elementos = mutableListOf<Elemento>()

        for (i in 1..5){
            val randomTituloId = "Titulo-" + Random.nextInt(0, 1500)
            val randomId = Random.nextInt(2500, 99999)
            val randomDescripcionId = "Descripcion-" + Random.nextInt(300, 1500)

            val elemento = Elemento(randomId,randomTituloId,randomDescripcionId,1)
            elementos.add(elemento)
        }

        listView = findViewById(R.id.listViewElementos)

        val adaptador = ListViewAdapter(elementos)
        listView.adapter = adaptador


    }
}