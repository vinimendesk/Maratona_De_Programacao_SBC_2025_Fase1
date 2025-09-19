fun main() {
    // ---------- ENTRADA DAS COSNTANTES ----------
    // Recebe o número de frutas e turmas.
    val inputFrutaseTurmas = readln()
    // Separa a entrada em uma lista.
    val listFrutaseTurmas = inputFrutaseTurmas.split(" ")
    // Separa o número de frutas da lista.
    val nFrutas = listFrutaseTurmas[0].toInt()
    // Separa o número de turmas da lista.
    val nTurmas = listFrutaseTurmas[1].toInt()

    // ---------- CONSTANTES ----------
    var indexFinal: Int = nTurmas-1
    var indexInicial: Int = 0

    // ---------- LISTAS ----------
    // Dados das turmas (Lista mutável de uma lista de String)
    val dadosTurma = mutableListOf<List<Int>>()

    val listPreResult = mutableListOf<Int>() // Transposição da lista dadosTurmas, não processada, vetor único.
    val listResult = mutableListOf<List<Int>>() // Lista final.


    // ---------- ENTRADA DAS TURMAS ----------
    // Para i em range 1..nFrutas
    for (i in 1..nFrutas) {
        // Recebe o numero de alunos que gostam da fruta i.
        val turma = readln()
        // Separa o dados dos alunos em uma lista.
        val turmaList = turma.split(" ").map { it.toInt() } // Para cada elemento na lista, converte para Int.
        // Converte todos os valores da lista para Int.
        dadosTurma.add(turmaList)
    }
    println(dadosTurma)

    // ---------- TRANSPOSIÇÃO DA MATRIZ ---------
    for (i in 1..nFrutas) { // Representa a coluna.
        for (j in 1..nTurmas) { // Representa a linha.
            // Busca cada índice de cada linha
            val dado = dadosTurma[j-1][i-1]
            // Adiciona o dado a lista
            listPreResult.add(dado)
        }
    }
    println(listPreResult)

/*    listPreResult.subList(indexInicial, indexFinal)*/

    // ---------- PROCESSAMENTO DA MATRIZ ---------
    for (i in 1..nFrutas) {
        // Faz o slice da lista igual ao número de turmas. Assim [20,15,14,12,10,8] vira [[20,15],[14,12],[10,8]
        val list: List<Int> = listPreResult.slice(indexInicial..indexFinal)
        listResult.add(list) // Retorna o maior valor de cada lista.
        indexInicial += nTurmas // Adiciona o valor do indexInicial para buscar a próxima lista.
        indexFinal += nTurmas // Adiciona o valor do indexFinal para buscar a próxima lista.
    }
    println(listResult)
    println("Resultado ${listResult.sumOf { it.max() }}") // Faz o somatório do maior valor de cada lista.


}
