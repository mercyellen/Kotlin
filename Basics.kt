/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
//need to make sample1 and sample2 unsigned
    ///val = constant
    //var = variable
    val sample1:Byte = 0x3A
    var sample2:Byte = 58
    var heartRate:Int = 85
    var deposits = 135002796
    val acceleration = 9.800
    var mass = 14.6
    var distance : Double = 129.763001
    var lost:Boolean = true
    var expensive:Boolean = true
    var choice:Int = 2
    val integral : String = "/u{222B}" //'/'+ 'u' + '{' + '2' + '2' + '2' + 'B' + '}'
    var greeting:String = "Hello"
    var name:String = "Karen"

    if(sample1 == sample2) println("The samples are equal")
    else println("The samples are not equal")

    if(heartRate >= 40 && heartRate <= 80) println("Heart rate is normal")
    else println("Heart rate is not normal")

    if(deposits >= 100000000) println("You are exceedingly wealthy. Pay my tuition pls")
    else println("Sorry you are so poor")

    var force = mass*acceleration

    println("force = $force")

    println("$distance is the distance.")

    if(lost && expensive) println("I am really sorry! I will get the manager.")
    if(lost and !expensive) println("Here is a coupon for 10% off.")

    when (choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }

    println("$integral is an integral")

    for(i:Int in 5..10) {
        print("i = $i")
    }

    var age:Int = 0
    while(age < 6) {
        println("age = $age")
        age++
    }

    print("$greeting" + " $name")

}
