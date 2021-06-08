// Define class with name, number and shift
class employee (name: String,
                number: String= "100222",
                shift: Int = 1)
{
    // define the fullInfo including name number and shift
    var fullInfo: String = "$name $number $shift"
    // define getter and setter for name; update fullInfo
    var name: String = name
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $number $shift"
        }
    // define getter and setter for number; update fullInfo
    var number: String = number
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $number $shift"
        }
    // define getter and setter for shift; update fullInfo
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
            fullInfo ="$name $number $shift"
        }

    // define printAll by printing fullInfo
    fun printAll() {
        println(fullInfo)
    }
}