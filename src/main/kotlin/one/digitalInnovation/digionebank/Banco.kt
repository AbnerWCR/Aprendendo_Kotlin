package one.digitalInnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
){
    fun dadosBanco(): String {
        return "banco: $nome, numero: $numero"
    }
}
