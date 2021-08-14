package one.digitalInnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilio(): Double

    override fun toString(): String {
       return """
            nome: $nome
            cpf: $cpf
            salario: $salario
            auxilio: ${calcularAuxilio()}
        """.trimIndent()
    }
}