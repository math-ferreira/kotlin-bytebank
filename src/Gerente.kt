class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int
) : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override val bonificacao get() =  super.bonificacao + this.salario


    override fun toString(): String {
        return "[${this.nome}, ${this.cpf}, ${this.salario}, ${this.bonificacao}]"
    }
}