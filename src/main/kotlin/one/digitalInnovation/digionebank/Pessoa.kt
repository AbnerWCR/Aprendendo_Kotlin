package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String? = null
    var cpf: String? = null
}

fun main() {
    val pessoa = Pessoa()

    pessoa.nome = "Joao"
    pessoa.cpf = "785.428.009-11"

    println(pessoa.nome)
    println(pessoa.cpf)
}