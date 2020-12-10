class Curso(val nome: String, val codigoCurso: Int, val quantidadeMaximaAlunos: Int) {

    //val professorTitular= ProfessorTitular()
    //val professorAdjunto = ProfessorAdjunto()

    private val listaDeAlunos = mutableListOf<Aluno>()

    fun  adicionarUmAluno(Aluno: Aluno): Boolean {
        if(listaDeAlunos.size < quantidadeMaximaAlunos){
            listaDeAlunos.add(Aluno)
            return true
        }
        return false
    }

    fun excluirAluno(Aluno: Aluno){
        listaDeAlunos.forEach { println(it.nome) }
        listaDeAlunos.remove(Aluno)
        listaDeAlunos.forEach { println(it.nome) }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }
}