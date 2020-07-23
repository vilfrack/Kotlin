fun main(){
    val double = 123.5
    val float = 123.5f
    val long = 123L// siempre va la L en mayuscula al final
    val int = 123
    val byte:Byte =0b00001011

    var a:Int =5
    var b:Long

    b= a.toLong()
    a.toByte()
    a.toShort()
    a.toFloat()
    a.toDouble()
    a.toString()

    var c =5
    var d =10

    println(c.plus(d))
    println(c.minus(d))
    println(c.times(d)) // multip0licacion
    println(c.div(d))
    println(c.compareTo(d))//compara los numeros, trae -1 si c es menor que d, 1 si es mayor a d y 0 si son iguales

    var r:Char = 'a'

    r = '\t'//tabulacion
    r = '\b'
    r = '\n'//salto de linea
    r = '\r'
    r = '\''
    r = '\"'
    r = '\\'
    r = '\$'

    //LOS VAL NO PUEDEN CAMBIAR SU VALOR UNA VEZ ASIGNADOS EL VALOR
    //EL VAR PUEDE SER MODIFICADO
    val aa:Int
    var bb=5
    var cc = 6
    var dd:Int

    dd = 6
    aa = 10

    /*************************STRING**********************************/
    var str = "Hola Mundo"
    for (c in str){
        println(c)
    }
    println(str[3])
    /***** string templates *******/
    val i = 10
    val pp = "i = $i"
    val s2 = "abc"
    val s1= "$s2.length is ${s2.length}"

    println(i)
    println(pp)
    println(s2)
    println(s1)

    str = "Mundo"
    println("Hola ${if(str.length > 3)"Curso kotlin" else str}")





}