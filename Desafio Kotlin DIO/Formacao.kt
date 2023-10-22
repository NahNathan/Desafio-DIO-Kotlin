package dio

class Formacao(
    val nome: String,
    val nivel: NivelFormacao,
    private val conteudos: MutableList<ConteudoEducacional> = mutableListOf()
) {

    private val alunosMatriculados: MutableList<Aluno> = mutableListOf()

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }

    fun listarConteudos(): List<ConteudoEducacional> = conteudos.toList()

    fun listarAlunosMatriculados(): List<Aluno> = alunosMatriculados.toList()
}

enum class NivelFormacao {
    BASICO, INTERMEDIARIO, AVANCADO
}
