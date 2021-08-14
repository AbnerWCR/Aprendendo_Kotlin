package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} -- ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} -- ${it.descricao}")
    }

    val pj = ClienteTipo.PJ
    println("${pj.name} -- ${pj.descricao}")
}
