import java.util.*

fun main(args: Array<String>) {


   var animal = Animal("Muncug","AZE020Ganja564862Dog",2)

    println(animal.name_GetSet)
    println(animal.passportId_GetSet)
    println(animal.age_GetSet)

    println(animal.getBithday(2024))

    println(animal)

    animal.name_GetSet="Muncug_2"
    println(animal)


    println("\n\n")


    var animal2 = Animal2()

    animal2.name="Name_2"
    animal2.passportId="PassportId_2"
    animal2.age=1

    println(animal2.name)
    println(animal2.passportId)
    println(animal2.age)
    println(animal2.toString())


    println("\n\n")


    var scanner = Scanner(System.`in`)

    print("Enter name: ")
    var name = scanner.next()

    print("Enter age: ")
    var age = scanner.nextInt()

    print("Enter point: ")
    var point = scanner.nextDouble()

    print("Enter height: ")
    var height = scanner.nextDouble()

    var student = Student(name,age,point,height)

    println("Name: ${student.name}, Age: ${student.age}, Point: ${student.point}, Height: ${student.height}")


    println("\n\n")


    print("Enter name: ")
    var name2 = scanner.next()

    print("Enter age: ")
    var age2 = scanner.nextInt()

    print("Enter workedday: ")
    var workedday = scanner.nextDouble()

    var employee = Employee(name2,age2,workedday)

    println("Name: ${employee.name}, Age: ${employee.age},  Workedday: ${employee.workedday}")
    println("Salary: ${employee.Salary(25)}")


    println("\n\n")


    print("Enter name: ")
    var name3 = scanner.next()

    print("Enter surname: ")
    var surname = scanner.next()

    print("Enter point1: ")
    var point1 = scanner.nextDouble()

    print("Enter point2: ")
    var point2 = scanner.nextDouble()

    print("Enter point3: ")
    var point3 = scanner.nextDouble()

    var student2_1 = Student2(name3,surname,point1,point2,point3)

    println("Average_1: ${student2_1.CalculateAverage(point1,point2,point3)}")

    print("Enter name: ")
    var name4 = scanner.next()

    print("Enter surname: ")
    var surname4 = scanner.next()

    print("Enter point1: ")
    var point1_2 = scanner.nextDouble()

    print("Enter point2: ")
    var point2_2 = scanner.nextDouble()

    print("Enter point3: ")
    var point3_2 = scanner.nextDouble()

    var student2_2 = Student2(name4,surname4,point1_2,point2_2,point3_2)

    println("Average_2: ${student2_2.CalculateAverage(point1_2,point2_2,point3_2)}")

    if(student2_1.CalculateAverage(point1,point2,point3)>student2_2.CalculateAverage(point1_2,point2_2,point3_2)) {
        println("average of ${name3} > average of ${name4}")
    }
    else
    {
        println("average of ${name4} > average of ${name3}")
    }
}