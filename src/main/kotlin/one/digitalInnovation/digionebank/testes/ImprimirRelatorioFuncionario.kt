package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario

class ImprimirRelatorioFuncionario {
    companion object{
        fun imprimir(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}