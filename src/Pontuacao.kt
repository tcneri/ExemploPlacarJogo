

class Pontuacao() {
    var listaJogos = mutableListOf<Int>()
    var quebraRecMinimo = 0
    var quebraRecMaximo = 0
    var recMaximo: Int? = null
    var recMinimo: Int? = null



    fun adicionarJogo(placar: Int){
        listaJogos.add(placar)
        println("O jogo e seu placar foram adicionados com sucesso!")
        if (listaJogos.size == 1){
            recMaximo = placar
            recMinimo = placar
        }

        else
            if (placar > recMaximo!!){
                quebraRecMaximo += 1
                recMaximo = placar
            }

            else if (placar < recMinimo!!){
                quebraRecMinimo += 1
                recMinimo = placar
            }
    }

    fun mostrarMinimo(){
        println("O placar mínimo da temporada até agora foi de $recMinimo pontos.")
    }

    fun mostrarMaximo(){
        println("O placar máximo da temporada até agora foi de ${recMaximo} pontos.")
    }

    fun mostrarQuebraRecordes(){
        println("A quantidade de vezes que os recordes foram quebrados, mínimo: $quebraRecMinimo e o máximo: $quebraRecMaximo")
    }

    fun mostrarJogos(){
        println("Já foram realizados ${listaJogos.size} jogos")
        var i = 1
        listaJogos.forEach(){
            println("O jogo $i teve o placar ${it}" )
            i += 1
        }
    }
}