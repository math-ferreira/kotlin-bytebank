open class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double
) {

    /**
     * Podemos escrever um metodo para o chamado Property, ao chama-la, usaremos apenas bonificacao, como um atributo
     */

    open val bonificacao: Double
        get() {
            println("Bonificacao Funcionario")
            return salario * 10 / 100
        }

    /**
     * Maneira tradicional, funcao para calcular a bonificacao, chamamos com getBonificacao2()
     */

    open fun calculaBonificacao(): Double {
        return salario * 10 / 100
    }

    /**
     * 2 versões mais simplificadas ainda, em apenas uma linha.. na segunda ainda podemos inferir o tipo de retorno
     */

    open val bonificacao3: Double get() = salario * 10 / 100

    open val bonificacao4 get() = salario * 10 / 100

    override fun toString(): String {
        return "[${this.nome}, ${this.cpf}, ${this.salario}]"
    }
}