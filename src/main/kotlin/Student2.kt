data class Student2( var name:String="", var surname:String="", var point1:Double=0.0, var point2:Double=0.0, var point3:Double=0.0) {

    fun CalculateAverage(point1: Double, point2: Double, point3: Double) :Double
    {
        return (point1+point2+point3)/3
    }
}