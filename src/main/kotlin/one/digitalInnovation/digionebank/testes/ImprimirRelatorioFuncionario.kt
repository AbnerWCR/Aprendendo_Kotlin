package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario

class ImprimirRelatorioFuncionario {
    // companion object é um método estático que pode ser chamado por classe e não por instância
    companion object{
        fun imprimir(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}