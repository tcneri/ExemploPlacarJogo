fun main(){
    val pontuacao = Pontuacao()
    var res = 0

    while (res == 0) {
        println("\n")
        println("<---------- MENU ---------->")
        println("Informe a ação que deseja realizar:")
        println("0 - Sair do menu ")
        println("1 - Adicionar jogo")
        println("2 - Visualizar pontuação máxima da temporada")
        println("3 - Visualizar pontuação minima da temporada")
        println("4 - Visualizar quebra de recordes")
        println("5 - Visualizar todos os jogos da temporada que foram adicionados")

        println("\n")

        var opcao = readLine().toString()



        when (opcao) {
            "1" -> {
                println("Insira o placar do jogo que deseja adicionar")
                var pc = readLine()?.toInt()
                if (pc != null) {
                    pontuacao.adicionarJogo(pc)
                }
            }

            "2" -> pontuacao.mostrarMaximo()

            "3" -> pontuacao.mostrarMinimo()

            "4" -> pontuacao.mostrarQuebraRecordes()

            "5" -> pontuacao.mostrarJogos()


            "0" -> {
                res = 1
                println("Você saiu do menu.")
            }

            else -> println("Opção inválida")

        }
    }
}

