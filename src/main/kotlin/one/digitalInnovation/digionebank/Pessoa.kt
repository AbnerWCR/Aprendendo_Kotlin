package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String? = null
    var cpf: String? = null
        private set
}

fun main() {
    val pessoa = Pessoa()

    pessoa.nome = "Joao"
    println(pessoa.nome)
    println(pessoa.cpf)

}