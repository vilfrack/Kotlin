fun main(){
    var array: Array<Any?>
    array = arrayOf(1,2,'a',null,5,"Hola")
    var array2 = arrayOf(1,2,'a',5,"Hola")

    println(array.get(5))
    println(array[5])

    array[2] = 'b' // en la posicion 2 le asigno el valor
    array.set(1,30) //el primer parametro es el indice y en el segundo es el valor

    println(array[2])
    println(array[1])

    array.forEach { println(it) }//con it se accede a los elementos del array
    array.reverse()
    array.forEachIndexed{i, valor -> println("Indice: $i y valor: ${valor}")}// al igual que el foreach pero con este accedemos al indice y al valor
}