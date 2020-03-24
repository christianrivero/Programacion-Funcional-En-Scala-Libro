object Page25 {
    def main(args: Array[String]) {
        printUntil2(10)
    }

    def printUntil2(x: Int) {
        var s = 0
        
        do {
            println(s)
            s = s+1
        } while(s <= x)
    }
}