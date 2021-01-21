fun testaComportamentosConta() {
    val contaMatheus = Conta("Matheus", 1000)
    // val contaMatheus = Conta(titular = "Matheus",numero = 1000) Outra forma de declarar variaveis no Constructor - isso sao as chamadas Labels
    // val contaMatheus = Conta(numero = 1000, titular = "Matheus") Nesse caso, indifere a ordem dos parametros

    contaMatheus.deposita(15000.00)

    val contaMaysa = Conta("Maysa", 2000)
    contaMaysa.deposita(12000.00)

    println("Conta 1 - Titular: ${contaMatheus.titular} e numero: ${contaMatheus.numero}")
    println("Conta 2 - Titular: ${contaMaysa.titular} e numero: ${contaMaysa.numero}")

    println(" - Depositando na conta do Matheus ")
    contaMatheus.deposita(150.00)
    println(contaMatheus.saldo)

    println(" - Sacando da conta Matheus ")
    contaMatheus.saca(40.0)
    println(contaMatheus.saldo)

    println(" - Saque em excesso Maysa ")
    contaMaysa.saca(1200.00)
    println(contaMaysa.saldo)

    println(" - Transferencia da conta do Matheus para a conta da Maysa ")
    println(" Saldo Matheus: ${contaMatheus.saldo} e saldo Maysa: ${contaMaysa.saldo} ")

    if (contaMatheus.transfere(120.00, contaMaysa)) {
        println("Transferencia realizada com sucesso")
    } else {
        println("Transferencia não realizada")
    }
    println("Saldo Matheus: ${contaMatheus.saldo} e saldo Maysa: ${contaMaysa.saldo} ")
}
