object Page22_2 {
    def main(args: Array[String]) {
        println("El Valor Absoluto de -5 es "+abs(-5))
        println("El Valor Absoluto de 7 es "+abs(7))
    }

    def abs(x: Int) = if(x>0) x else -x
}