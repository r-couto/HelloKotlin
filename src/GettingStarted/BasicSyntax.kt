package GettingStarted

import interfaces.Exercicio

class BasicSyntax : Exercicio {

    override fun executar() {
        e10();
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

    fun e5(): Unit {
        val texto = "carro"
        val resultado = tamanhoDoTexto(texto)
        println("Tamanho do texto \"$texto\" = $resultado")
    }

    fun e6(): Unit {
        val lista = listOf("maçã", "abacaxi", "uva")
         for (item in lista.indices) {
             println("$item -> ${lista[item]}")
         }
    }

    fun e7(): Unit {
        val lista = listOf("livro", "revista", "quadrinhos")
        var index = 0
        while (index < lista.size) {
            println("$index -> ${lista[index]}")
            index++
        }
    }

    fun e8(): Unit {
        val numero: Any = "2"
        when (numero) {
            "1"     -> println("um")
            "2"     -> println("dois")
            "3"     -> println("três")
            is Int  -> println("inteiro")
            !is String -> {
                println("...")
                println("não é string")
            }
            else    -> println("desconhecido")
        }
    }

    fun e9(): Unit {
        val lista = listOf("livro", "revista", "quadrinhos")

        if ("livro" in lista) {
            println("está na lista")
        } else {
            println("não está na lista")
        }

        for (numero in 1..10 step 2) {
            println("${numero}")
        }
        println("---")
        for (x in 10 downTo 0 step 2) {
            println(x)
        }
    }

    fun e10(): Unit {
        val lista = listOf("livro", "revista", "quadrinhos")

        lista
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
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

    fun tamanhoDoTexto(obj: Any): Int? {
        if (obj is String)
            return obj.length
        else
            return null
    }

}