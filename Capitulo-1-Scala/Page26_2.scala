object Page26_2 {
    def main(args: Array[String]) {
        printUntil4(5, 6)
    }
    
    def printUntil4(x: Int, y: Int) {
        for(a <- 1 to x; b <- 4 to y) {
            println("x: "+a+" ; y; "+b)
        }
    }   
}