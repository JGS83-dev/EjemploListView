package com.example.ejemplolistview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.ejemplolistview.R
import com.example.ejemplolistview.clases.Elemento

class ListViewAdapter (private val dataSet: List<Elemento>):
    BaseAdapter() {
    override fun getCount() = dataSet.size

    override fun getItem(position: Int): Any {
        return dataSet.get(position)
    }

    override fun getItemId(position: Int): Long {
        return dataSet.get(position).id.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.elemento_layout, parent, false)

        var txtTitulo:TextView = view.findViewById(R.id.txtTitulo)
        var txtDescripcion:TextView = view.findViewById(R.id.txtDescripcion)
        var txtEstado:TextView = view.findViewById(R.id.txtEstado)

        txtTitulo.text = dataSet.get(position).titulo
        txtDescripcion.text = dataSet.get(position).descripcion

        var estado = "Inactivo"

        if(dataSet.get(position).estado == 1)
            estado = "Activo"

        txtEstado.text = estado

        return view
    }

}