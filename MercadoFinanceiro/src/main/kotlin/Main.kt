import kotlin.math.pow

fun main() {
        println("Calculadora de Juros Compostos")

        println("Digite o valor inicial do investimento:")
        val valorInicial = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        println("Digite a taxa de juros anual:")
        val taxaJuros = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        println("Digite o prazo do investimento em anos:")
        val prazoAnos = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        val valorFinal = valorInicial * (1 + taxaJuros / 100).pow(prazoAnos)
        val juros = valorFinal - valorInicial

        println("Valor inicial: R$%.2f".format(valorInicial))
        println("Taxa de juros anual: %.2f%%".format(taxaJuros))
        println("Prazo do investimento: %.2f anos".format(prazoAnos))
        println("Valor final: R$%.2f".format(valorFinal))
        println("Juros: R$%.2f".format(juros))
    }
