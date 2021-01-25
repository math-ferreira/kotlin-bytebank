import Diretor as Diretor

fun main() {
    println("Hello World ByteBank")

    val contaCorrente: Conta = ContaCorrente(
            titular = "Matheus",
            numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
            titular = "Maysa",
            numero = 2000
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.00)
    contaPoupanca.saca(100.00)

    println("Saldo apos saque conta corrente: ${contaCorrente.saldo}")
    println("Saldo apos saque conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("Saldo apos transferir conta corrente: ${contaCorrente.saldo}")
    println("Saldo apos receber conta poupanca: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.00, contaCorrente)

    println("Saldo apos transferir conta poupanca: ${contaPoupanca.saldo}")
    println("Saldo apos receber conta corrente: ${contaCorrente.saldo}")


}

