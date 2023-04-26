fun main(){
    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
    val sudoers: List<Int> = systemUsers                              // 2 - Apenas criação de lista para leitura apenas

    fun addSystemUser(newUser: Int) {                                 // 3
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {                                  // 4
        return sudoers
    }

    fun main() {

    }
    addSystemUser(4)                                       // 5 - Adicionando um novo usuario
    println("Tot sudoers: ${getSysSudoers().size}")               // 6 - Olhando o tamanho da lista
    getSysSudoers().forEach {                                     // 7 For it para percorer a lista e exibir seu conteudo
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}
