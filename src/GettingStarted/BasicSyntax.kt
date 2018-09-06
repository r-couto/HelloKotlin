package GettingStarted

import interfaces.Exercicio

class BasicSyntax : Exercicio {

    override fun executar() {
//        e1();
//        e2();
//        e3();
        e4();
    }

    fun e1(): Unit {
        println("HelloKotlin")
    }
    fun e2(): Unit {
        val a = 11
        val b = 25
        println("$a + $b = ${soma(a, b)}")
//        val resultado = soma(a, b)
//        println("${a} + ${b} = ${resultado}")
    }

    fun e3(): Unit {
        val a = 11
        val b = 25
        println("Maior entre $a e $b = ${maior(a, b)}")
    }

    fun e4(): Unit {
        val a = null
        val b = 25
        println("${if(a == null) 0 else a} + $b = ${soma2(a, b)}")
    }

    fun soma(a: Int, b: Int) = a + b
    /*fun soma(a: Int, b: Int): Int {
        return a + b
    }*/

    fun maior(a: Int, b: Int) = if (a > b) a else b

    fun soma2(a: Int?, b: Int): Int {
        if (a != null) {
            return a + b
        } else {
            return b
        }
    }

}