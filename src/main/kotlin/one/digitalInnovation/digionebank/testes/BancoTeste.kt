package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Banco

fun main(){

    val digiOneBank = Banco(nome = "DigiOneBank", numero = 123)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val digiOneBank2 = digiOneBank.copy(nome = "TesteBank")

    println(digiOneBank2.dadosBanco())
}