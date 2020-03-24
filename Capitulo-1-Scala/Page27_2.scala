object Page27_2 {
    def main(args: Array[String]) {
        forListaConFiltros
    }

    def forListaConFiltros = {
        val numList = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for(a <- numList
            if a<=5
            if a!=3) {
                println(a)
            }
    }
}