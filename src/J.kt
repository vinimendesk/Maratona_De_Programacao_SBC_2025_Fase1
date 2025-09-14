//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Recebe a entrada com as dificuldades das questões.
    val questions = readln()
    // Separa o input por espaços.
    val questionsList = questions.split(" ")
    // Exibe a lista agora processada.
    println("Dificuldades recebidas: $questionsList")

    // Define como false todas as dificuldades, se houver a dificuldade no input,
    // Define como verdadeiro.
    val difficultList = mutableListOf(false, false, false, false)

    // Para cada elemento em questionsList, verifique a dificuldade e atribuia como
    // Verdadeira a dificuldade encontrada.
    for (question in questionsList) {
        when (question) {
            "1" -> difficultList[0] = true
            "2" -> difficultList[1] = true
            "3" -> difficultList[2] = true
            "4" -> difficultList[3] = true
            else -> {}
        }
    }

    // Conta a quantidade de false em difficultList
    val falseQuantity = difficultList.count{ !it }
    println("Quantidade de dificuldades faltantes: $falseQuantity")

}