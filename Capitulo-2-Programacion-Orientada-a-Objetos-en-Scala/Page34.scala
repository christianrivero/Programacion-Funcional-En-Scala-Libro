class MiPrimeraClase {
    var a = 1
    
    def suma(b: Int): Int = {
        a += b
        a
    }
}

object Page34 {
    def main(args: Array[String]) {
        val o1 = new MiPrimeraClase
        println(o1.suma(7))
    }
}