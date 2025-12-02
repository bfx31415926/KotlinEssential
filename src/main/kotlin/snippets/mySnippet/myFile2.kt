package myFile2

open class Base <out T>(val data: T)

class Inherited<T>(val data1: T): Base<T>(data1)

fun main(){
    val v1: Base<Number> = Inherited(5)
        //Если убрать префикс "out" вверху,
        //то компилятор не пропустит, например, строки:
        //val v2: Base<Number> = Inherited("")
}