object Page30 {
    val x = 10
    val y = 20

    def main(args: Array[String]) {
        println(prueba(3))
    }

    def g(y: Int): Int = {
        x + y
    }

    def prueba(z: Int): Int = {
        val x = 0
        g(x+y+z)
    }
}