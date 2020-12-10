class Aluno(val nome: String, val sobrenome: String, val codigoDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigoDeAluno != other.codigoDeAluno) return false

        return true
    }

    override fun toString(): String {
        return "O aluno nome $nome $sobrenome tem o codigo De Aluno $codigoDeAluno)"
    }
}