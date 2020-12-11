
fun main() {
    println("Hello World ByteBank")

    val math = Funcionario(
            "Matheus",
            "13166836833",
            1000.0
    )

    println("Nome: ${math.nome}")
    println("Cpf: ${math.cpf}")
    println("Salario: ${math.salario}")
    println("Bonificacao: ${math.bonificacao()}")

}