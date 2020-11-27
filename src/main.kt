fun main() {
    println("Hello World ByteBank")

    testaObjetos()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaObjetos() {
    val contaMatheus = Conta()
    contaMatheus.titular = "Matheus"
    contaMatheus.numero = 10
    contaMatheus.saldo = 1500.00

    val contaMaysa = Conta()
    contaMaysa.titular = "Maysa"
    contaMaysa.numero = 200
    contaMaysa.saldo = 1000.00

    println(contaMatheus.titular)
    println(contaMaysa.titular)

    println("Depositando na conta do Matheus")
    deposita(contaMatheus, 150.00)
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor;
}

fun testaLacos() {

    var i = 0
    while (i < 5) {
        val titular: String = "Matheus $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0
        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }
        val titular: String = "Matheus $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        testaCondicoes(saldo)
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}