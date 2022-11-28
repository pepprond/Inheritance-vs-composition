interface Son1{
    val name: String
    val surname: String
    val age: Int

    fun getInfo1(): String{
        return "name: $name, surname: $surname, age: $age"
    }

}

 open class Son2(open val name: String, open val surname: String, open val age: Int){
   fun getInfo2(){
        println("name: $name, surname: $surname, age: $age")
    }
}

class Parent(override val name: String, override val surname: String, override val age: Int) :Son1, Son2(name,surname,age)


fun main(args: Array<String>) {
    val son1=Parent("giuseppe", "rondelli", 27)
    val son2 =Parent("marco", "rondelli",21)

    println(son1.getInfo1())
    println(son2.getInfo2())

}

