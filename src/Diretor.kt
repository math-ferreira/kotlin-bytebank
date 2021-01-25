class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int,
        val plr: Double
) : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override val bonificacao: Double
        get() {
            println("Bonificacao Diretor")
            return super.bonificacao + this.salario + this.plr
        }


    override fun toString(): String {
        return "[${this.nome}, ${this.cpf}, ${this.salario}, ${this.bonificacao}, ${this.plr}]"
    }

}