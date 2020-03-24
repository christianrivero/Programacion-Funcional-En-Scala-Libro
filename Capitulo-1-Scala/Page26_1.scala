object Page26_1 {
    def main(args: Array[String]) {
        printUntil3(7)
    }
    
    def printUntil3(x: Int) {
        for(a <- 0 to x) {
            println(a)
        }
    }
}