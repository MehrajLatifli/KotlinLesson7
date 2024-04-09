class Animal(var name:String, var passportId:String, var age:Int) {

    var name_GetSet: String = name
        get() {
            println("name_GetSet is called")
            return field
        }
        set(value) {
            field = value
            println("name_GetSet setter is called")
        }

    var passportId_GetSet: String = passportId
        get() {
            println("passportId_GetSet is called")
            return field
        }
        set(value) {
            field = value
            println("passportId_GetSet setter is called")
        }

    var age_GetSet: Int = age
        get() {
            println("age_GetSet is called")
            return field
        }
        set(value) {
            field = value
            println("age_GetSet setter is called")
        }

    fun getBithday(thisyear: Int):Int{

        val bithday = thisyear -age

        return bithday

    }

    override fun toString(): String {
        return "${name_GetSet} ${passportId_GetSet} ${age_GetSet}"
    }
}

