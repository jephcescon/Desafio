class DigitalHouseManager {

    private val listaAlunos = mutableListOf<Aluno>()
    private val listaProfessores = mutableListOf<Professor>()
    private val listaCursos = mutableListOf<Curso>()
    private val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(curso: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        listaCursos.add(
            Curso(curso, codigoCurso, quantidadeMaximaDeAlunos)
        )
        println("Curso $curso registrado com sucesso!")
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos) {
            if (curso.codigoCurso == codigoCurso) {
                listaCursos.remove(curso)
                println("${curso.nome} removido com sucesso!")
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        listaProfessores.add(
            ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        )
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String){
        listaProfessores.add(
            ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        )
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (professor in listaProfessores) {
            if (professor.codigoDeProfessor == codigoProfessor) {
                listaCursos.remove(professor)
                println("professor removido com sucesso!")
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        listaAlunos.add(
            Aluno(nome, sobrenome, codigoAluno)
        )

        println("O aluno $nome foi adicionado com sucesso!")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno: Aluno = listaAlunos.filter { it -> it.codigoDeAluno == codigoAluno }.single()

        val curso: Curso = listaCursos.filter { it.codigoCurso == codigoCurso }.single()

        if(curso.adicionarUmAluno(aluno)){
            listaMatriculas.add(
                Matricula(aluno, curso, "10/10/2020")
            )
        }else{
            println("Não foi possível realizar a matrícula do aluno ${aluno.nome} porque não há vagas.")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val titular: Professor = listaProfessores.filter { it -> it.codigoDeProfessor == codigoProfessorTitular }.single()

        val adjunto: Professor = listaProfessores.filter { it -> it.codigoDeProfessor == codigoProfessorAdjunto }.single()

        val curso: Curso = listaCursos.filter { it.codigoCurso == codigoCurso }.single()
    }
}