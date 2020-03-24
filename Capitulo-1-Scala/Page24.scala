object Page24 {
    def main(args: Array[String]) {
        printUntil(10)
    }
    
    def printUntil(x: Int) {
        var s = 0
        
        while(s <= x) {
            println(s)
            s += 1
        }
    }
}