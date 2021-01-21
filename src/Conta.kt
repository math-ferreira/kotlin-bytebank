class Conta(
        val titular: String,
        //val numero: Int = 0 se não for informado, assume valor 0
        val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
    /*
    Bloco comentado, posi não é a sintaxe de getter e setter esperado

    fun getTitular(): String {
        return titular
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getNumero(): Int {
        return numero
    }

    fun setNumero(titular: Int) {
        this.numero = numero
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(saldo: Double) {
        if (saldo > 0) {
            this.saldo = saldo
        }
    } */
}