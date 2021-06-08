fun main(args: Array<String>) {
    var person1 = employee("Don King","111000",1)
    var person2 = employee("Muhammed Ali","222000",2)
    var person3 = employee("George Foreman","333000",3)

    println(person1.name + "\n" + person1.number + "\n" + person1.shift.toString())
    println("\n")
    println(person2.name + "\n" + person2.number + "\n" + person2.shift.toString())
    println("\n")
    println(person3.name + "\n" + person3.number + "\n" + person3.shift.toString())

}
