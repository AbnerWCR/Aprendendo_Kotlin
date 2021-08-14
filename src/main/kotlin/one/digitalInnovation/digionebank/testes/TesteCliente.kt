package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Cliente
import one.digitalInnovation.digionebank.ClienteTipo

fun main(){

    val samira = Cliente(
        nome = "Samira Silva",
        cpf = "95175385246",
        clienteTipo = ClienteTipo.PF,
        senha = "1234")

    println(samira)

    TesteLogin().verificacao(samira)
}