package one.digitalInnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome, cpf, salario), Login {
    override fun calcularAuxilio() = salario * 0.4

    override fun autenticacao(): Boolean = "123" == senha
}