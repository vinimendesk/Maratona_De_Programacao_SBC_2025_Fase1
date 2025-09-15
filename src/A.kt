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

    // ---------- LISTAS ----------
    // Dados das turmas (Lista mutável de uma lista de String)
    val dadosTurma = mutableListOf<List<Int>>()

    val listPreResult = mutableListOf<Int>()


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
            val dado = dadosTurma[j][i]
            // Adiciona o dado a lista
            listPreResult.add(dado)
        }
    }

    // Após transpor a matriz, será necesário iterar sobre toda a matriz e retornar o maior valor
    // e por fim fazer a soma dos mesmos.


}