fun main() {
    val numero = (1..100).random()
    var tentativas = 0

    while (true) {
        print("Digite um número entre 1 e 100: ")
        val palpite = readLine()?.toIntOrNull()

        if (palpite == null) {
            println("Por favor, digite um número válido.")
            continue
        }

        tentativas++

        when {
            palpite == numero -> {
                println("Parabéns, você acertou em $tentativas tentativas!")
                return
            }
            palpite < numero -> println("O número é maior.")
            else -> println("O número é menor.")
        }
    }
}