package one.digitalInnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Login {
    override fun autenticacao(): Boolean = "1234" == senha

    override fun toString(): String {
        return """
            nome:   $nome
            cpf:    $cpf
            tipo:   ${clienteTipo.descricao}
        """.trimIndent()
    }
}