/*Esta es una forma modificada y simplificada del ejemplo del libro*/
val numList = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val lista = for(a <- numList; if(a<=5); if(a!=3)) yield a*2

for(b <- lista) {
    println("Valor obtenido del yield, y duplicado: "+b)
}