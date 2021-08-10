package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String? = null
    var cpf: String? = "123.456.782-88"
        private set

    constructor()

    fun dadosPessoa() = "nome: $nome e cpf: $cpf"
}

fun main() {
    val pessoa = Pessoa()

    var sobrenome: String? = "Silva"

    pessoa.nome = "Joao $sobrenome"
    println(pessoa.dadosPessoa())

}