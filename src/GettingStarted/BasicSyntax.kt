package GettingStarted

import interfaces.Exercicio

class BasicSyntax : Exercicio {

    override fun executar() {
        e10()
    }

    private fun e1() {
        println("HelloKotlin")
    }

    private fun e2() {
        val a = 11
        val b = 25
        println("$a + $b = ${soma(a, b)}")
    }

    private fun e3() {
        val a = 11
        val b = 25
        println("Maior entre $a e $b = ${maior(a, b)}")
    }

    private fun e4() {
        val a: Int? = null
        val b = 25
        println("${if(a == null) 0 else a} + $b = ${soma2(a, b)}")
    }

    private fun e5() {
        val texto = "carro"
        val resultado = tamanhoDoTexto(texto)
        println("Tamanho do texto \"$texto\" = $resultado")
    }

    private fun e6() {
        val lista = listOf("maçã", "abacaxi", "uva")
         for (item in lista.indices) {
             println("$item -> ${lista[item]}")
         }
    }

    private fun e7() {
        val lista = listOf("livro", "revista", "quadrinhos")
        var index = 0
        while (index < lista.size) {
            println("$index -> ${lista[index]}")
            index++
        }
    }

    private fun e8() {
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

    private fun e9() {
        val lista = listOf("livro", "revista", "quadrinhos")

        if ("livro" in lista) {
            println("está na lista")
        } else {
            println("não está na lista")
        }

        for (numero in 1..10 step 2)
            println("${numero}")

        println("---")

        for (x in 10 downTo 0 step 2)
            println(x)
    }

    private fun e10() {
        val lista = listOf("livro", "revista", "quadrinhos")

        lista
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }

    private fun soma(a: Int, b: Int) = a + b
    private fun soma2(a: Int?, b: Int) = if (a != null) a + b else b
    private fun maior(a: Int, b: Int) = if (a > b) a else b
    private fun tamanhoDoTexto(obj: Any) = if (obj is String) obj.length else null

}