package com.example.ejemplolistview.clases

class Elemento {
    var id: Int = 0
    var titulo: String = ""
    var descripcion: String = ""
    var estado: Int = 0

    constructor(
        id: Int,
        titulo: String,
        descripcion: String,
        estado: Int
    ) {
        this.id = id
        this.titulo = titulo
        this.descripcion = descripcion
        this.estado = estado
    }

    constructor()


}