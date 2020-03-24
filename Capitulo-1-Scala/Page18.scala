object Page18 {
    def main(args: Array[String]) {
        val x = 10        

        val result = {
            val x = f(3)
            x * x
        } + x
        
        println(result)
    }

    def f(y: Int) = y + 1
}