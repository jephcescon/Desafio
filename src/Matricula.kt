class Matricula(val aluno: Aluno, val curso: Curso, val matricula: String) {
    init {
        println("${aluno.nome} foi matriculado no curso: ${curso.nome} na data de $matricula")
    }
}