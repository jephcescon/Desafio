fun main(){
    val professorTitular1 = ProfessorTitular("Professor 1","Titular 1",0,1000,"Web")
    val professorTitular2 = ProfessorTitular("Professor 2","Titular 2",0,1001,"Desktop")

    val professorAdjunto1 = ProfessorAdjunto("ProfessorAdjunto 1","1",0,5000,8)
    val professorAdjunto2 = ProfessorAdjunto("ProfessorAdjunto 2","2",0,5001,6)

    val dhm = DigitalHouseManager()

    dhm.registrarProfessorAdjunto("ProfessorAdjunto 1", "1", 5000, 10)
    dhm.registrarProfessorAdjunto("ProfessorAdjunto 2", "2", 5001, 8)

    dhm.registrarProfessorTitular("Professor 1", "Titular 1",1000, "Web")
    dhm.registrarProfessorTitular("Professor 2", "Titular 2",1001, "Desktop")

    dhm.registrarCurso("Full Stack", 20001, 3)
    dhm.registrarCurso("Android", 20002, 2)

    dhm.alocarProfessores(20001, 1000, 5000)
    dhm.alocarProfessores(20002, 1001, 5001)

    dhm.matricularAluno("Jepherson", "Cescon", 1)
    dhm.matricularAluno("Aluno 1", "Aluno 1", 2)
    dhm.matricularAluno("Aluno 2", "Aluno 2", 3)

    dhm.matricularAluno(1, 20001)
    dhm.matricularAluno(2, 20001)

    dhm.matricularAluno(1, 20002)
    dhm.matricularAluno(2, 20002)
    dhm.matricularAluno(3, 20002)

}