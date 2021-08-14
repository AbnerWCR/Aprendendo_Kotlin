package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa = Pessoa(nome = "Abner", cpf = "78985245699")
    println("Pessoa: ${pessoa.nome}, cpf: ${pessoa.cpf}")

    val funcionario = Funcionario(nome = "Wallace", cpf = "54665496333", salario = BigDecimal(1231564.0))

    println("Funcionario: ${funcionario.nome}, cpf: ${funcionario.cpf}, salario: ${funcionario.salario}")

}