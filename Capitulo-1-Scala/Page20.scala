object Page20 {
    def main(args: Array[String]) {
        println(f(g(3), g(5)))
    }

    def f(x: Int, y: Int): Int = {
        val z = 5
        x+y+z
    }

    def g(z: Int): Int = {
        val x = 10
        z + x
    }
}