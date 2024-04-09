data class Animal2(var name:String="", var passportId:String="", var age:Int=0) {


    override fun toString(): String {
        return "${name} ${passportId} ${age}"
    }}