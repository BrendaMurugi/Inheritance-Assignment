fun main() {
var car = Car("Jeep", "Wrangler", "PinkBlack", 4)
    car.identity()
    car.carry(10)
    println(car.calculateParkingFees(5))

var nissan = Bus("Toyota", "Coaster", "Black", 13)
    nissan.identity()
    nissan.carry(20)
    println(nissan.maxTripFare(115.5))
    println(nissan.calculateParkingFees(5))

}
//Create a class Car with the following attributes: make, model, color, capacity.
open class Car(var make:String, var model:String, var color:String, var capacity:Int) {

//Prints out “Carrying $people passengers” if the number of people is within its capacity
//else it prints out “Over capacity by $x people” where x is the number of people exceeding its capacity
    fun carry(people:Int) {
    if (people <= capacity) {
        println("Carrying $people passengers.")
    }
    else {
        var x = people - capacity
        println("Over capacity by $x people.")
    }
}
//Prints out the color, make and model in the following format e.g: “I am a white subaru legacy”
    fun identity() {
        println("I am a $color $make $model.")
    }
 //Calculates and returns the parking fees by multiplying the hours by 20
   open fun calculateParkingFees(hours:Int):Int {
        var fees = hours * 20
            return fees
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
class Bus(make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity) {

 //In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per trip.
    fun maxTripFare(fare: Double):Double {
        var maxFare = fare * capacity
     return maxFare
    }

 //The bus’ calculateParkingFees method returns the product of hours and the capacity of the bus
    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var fees2 = hours * capacity
        return fees2
    }

}