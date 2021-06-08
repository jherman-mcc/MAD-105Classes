fun main(args: Array<String>) {
    // set my parameters to my fields
    var person1 = employee("Don King","111000", 1)
    var person2 = employee("Muhammed Ali","222000", 1)
    var person3 = employee("George Foreman","333000", 3)

    // print my first record for person1 "as is"
    person1.printAll()
    // update person1 and reprint with new information for all three fields
    person1.name="Joe Frazer"
    person1.number="112000"
    person1.shift=2
    person1.printAll()
    // print person2 and person3 records "as is"
    person2.printAll()
    person3.printAll()
}
