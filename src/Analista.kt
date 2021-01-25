class Analista(
        nome: String,
        cpf: String,
        salario: Double
) : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
) {

    override val bonificacao: Double
        get() {
            println("Bonificacao Analista")
            return super.bonificacao + this.salario * 0.1
        }


    override fun toString(): String {
        return "[${this.nome}, ${this.cpf}, ${this.salario}, ${this.bonificacao}]"
    }
}