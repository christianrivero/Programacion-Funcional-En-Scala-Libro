def printUntil2(x: Int) {
    var s = 0
    do {
        println(s)
        s = s+1
    } while(s <= x)
}

printUntil2(10)