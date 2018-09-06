package GettingStarted

import interfaces.Exercicio

class BasicSyntax : Exercicio {

    override fun executar() {
//        e1();
        e2();
    }

    fun e1(): Unit {
        println("HelloKotlin")
    }
    fun e2(): Unit {
        val a = 5
        val b = 6
        val resultado = soma(a, b)
        println("${a} + ${b} = ${resultado}")
    }

    fun soma(a: Int, b: Int): Int {
        return a + b
    }
}