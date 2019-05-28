package com.br.uol.teste

class Model {

   lateinit var dataDia: String
    lateinit var descricao:String



    constructor(dataDia: String, descricao: String) {
        this.dataDia = dataDia
        this.descricao = descricao
    }
    constructor()
}