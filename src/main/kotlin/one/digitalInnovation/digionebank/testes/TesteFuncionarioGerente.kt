package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Gerente

fun main() {
    var jamilson = Gerente(nome = "Jamilson Neves", cpf = "85245695173", salario = 45000.00, senha = "123")

    ImprimirRelatorioFuncionario.imprimir(jamilson)

    TesteLogin().verificacao(jamilson)
}
