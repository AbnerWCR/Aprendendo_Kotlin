package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Pessoa

    fun main() {
        val pessoa = Pessoa(nome = "Abner", cpf = "12345685211")

        println(pessoa.nome)
        println(pessoa.cpf)
}