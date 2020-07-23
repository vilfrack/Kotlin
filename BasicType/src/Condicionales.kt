fun main(){
    var max = 20
    if (max<10) max = 20 else max = 1

    println(max)

    when(max){
        20 -> println(max)
        else -> {
            println("OH")
            println(max)
        }
    }

    /*CASTEO*/
    //x is string
    //is int
    //is string
    //var pp = "20" as String

    /**********COLECCIONES***************/
    // INMUTABLE
    val list : List<Int>
    val set : Set<Int>// en los de tipo set no se repiten los valores
    val map : Map<String,Int>//<clave,valor>
    val hashSet : HashSet<Int>// en los de tipo set no se repiten los valores//NO EXISTEN DE FORMA MUTABLE
    val hashMap : HashMap<String,Int>//<clave,valor> muestra los valores ordenados por la clave //NO EXISTEN DE FORMA MUTABLE
    // MUTABLE
    val listMutable : MutableList<Int>
    val setMutable : MutableSet<Int>
    val mapMutable : MutableMap<String,Int>

    println("/******* INMUTABLE *************/")
    list = listOf(1,2,3,4,5)
    set = setOf(3,1,2,3)
    map = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
    hashSet = hashSetOf(3,1,2,3)
    hashMap = hashMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(list)
    println(set)
    println(map)
    println(hashSet)
    println(hashMap)
    println("/******* MUTABLE *************/")
    listMutable = mutableListOf(1,2,3,4,5)
    listMutable.add(9)
    listMutable.add(2000)
    listMutable.remove(2)//elimina por valor
    listMutable.removeAt(0)//elimina por indice
    setMutable = mutableSetOf(3,1,2,3)
    mapMutable = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)

    println(listMutable)
    println(setMutable)
    println(mapMutable)
    /************************************/


    for (a in list) println("Imprimir Lista")
    for (l in list){
        if(l==4) println("Imprimir Lista")
        print("$l")
    }
    //obtenemos el indice, y debe tener el indice y el valor del elemento
    for ((index,valor) in list.withIndex()){
        println("indice : ${index} - valor :${valor}")
    }

    bucle@ for (i in 1..10){
        for(j in 1..10){
            if (j==2) break@bucle
        }
        println(i)
    }


}