object Page27_1 {
    def main(args: Array[String]) {
        forLista
    }

    def forLista = {
        val numList = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for(a <- numList) {
            println(a)
        }
    }
}