val name:String = "Solo Tech"


var birthdayGreet:String = "Happy Birthday"
var birthday:String = "09-30-1997"
var date:String? = "09-30-1997"
var age:Int = 10

fun calcAge(currentYear:Int, birthYear:Int) {
	var age = birthYear - currentYear

	if(birthday == date) {
	  println(birthdayGreet)
	} else {
	  birthdayGreet = "Happy Late Birthday"
	  println(birthdayGreet)
	}
	println(age)
}



fun main() {
	calcAge(1997, 2020)
	date = null
	println(date)
	calcAge(1997, 2020)
}
