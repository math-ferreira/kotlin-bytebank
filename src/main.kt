fun main() {
    println("Hello World ByteBank")

    testaObjetos()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor;
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.saldo += valor
            return true
        }
        return false
    }
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

    println("- Depositando na conta do Matheus")
    contaMatheus.deposita(150.00)
    println(contaMatheus.saldo)

    println("- Sacando da conta Matheus")
    contaMatheus.saca(40.0)
    println(contaMatheus.saldo)

    println("- Saque em excesso Maysa")
    contaMaysa.saca(1200.00)
    println(contaMaysa.saldo)

    println("- Transferencia da conta do Matheus para a conta da Maysa")
    println("Saldo Matheus: ${contaMatheus.saldo} e saldo Maysa: ${contaMaysa.saldo}")
    if (contaMatheus.transfere(120.00, contaMaysa)) {
        println("Transferencia realizada com sucesso")
    } else {
        println("Transferencia não realizada")
    }
    println("Saldo Matheus: ${contaMatheus.saldo} e saldo Maysa: ${contaMaysa.saldo}")
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