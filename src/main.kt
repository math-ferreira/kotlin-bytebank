import Diretor as Diretor

fun main() {
    println("Hello World ByteBank")

    val math = Funcionario(
            "Matheus",
            "13166836833",
            1000.0
    )
    println(math)

    val antonio = Gerente(
            "Antonio",
            "10645514447",
            7500.00,
            566
    )
    println(antonio)


    val maysa = Diretor(
            "Maysa",
            "3452098273",
            15000.00,
            123,
            12500.00
    )
    println(maysa)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(math)
    calculadora.registra(antonio)
    calculadora.registra(maysa)

    println("Total de bonificacao: ${calculadora.total}")
}