package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Analista
import one.digitalInnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    var maria = Analista(nome = "Maria", cpf = "12345678911", salario = 21000.0)
    println(maria.nome)
    println(maria.cpf)
    println("R$ ${maria.salario}")
    println("--------------------------")

    ImprimirRelatorioFuncionario.imprimir(maria)

}