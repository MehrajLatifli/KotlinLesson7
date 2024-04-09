data class Employee ( var name:String="", var age:Int=0, var workedday:Double=0.0){

    fun Salary(day:Int):Double{

        if(day<=20){

            return day*15.toDouble()
        }
        else{

            return day*15.toDouble()+ (day -20)*20
        }
    }
}