fun main (){
    run {
        print("Informe a população do país A: ")
        var popA = readln().toInt()

        print("Informe a população do país B: ")
        var popB = readln().toInt()

        var anos = 0

        while (popA <= popB) {
            popA += (popA * 0.03).toInt()
            popB += (popB * 0.015).toInt()
            anos++
        }

        println("Serão necessários $anos anos para a população do país A ultrapassar ou igualar a população do país B.")
    }
}