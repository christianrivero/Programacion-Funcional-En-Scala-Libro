val x = 10
val y = 20

def g(y: Int): Int = {
    x + y
}

def prueba(z: Int): Int = {
    val x = 0
    g(x+y+z)
}

println(prueba(3))