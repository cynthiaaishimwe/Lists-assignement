fun main() {
    val myList =  ListOfStrings(listOf("Cynthia","Magy","Carine","Grolia","Josh","Ishimwe","Kiki","Clara","Akii","Ukooo"))

    println( myList)
    var averageheight = listOf(1.65,1.67,1.70,1.80,1.90,2.00)
    println(averageheight)
    People()
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun ListOfStrings(name:List<String>):String{
  var list = name.filterIndexed{index, name->index %2==0}
    return list.toString()



}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height


//fun averageAndHeight(height: list<Double>): Double{
//
//    var avg=height.average()
//    var totalheight=height.sum()
//    return avg


//    var height= listOf(45.7,36.5,18.9,34.1,96.9,79.1)
//    var (avg,totalheight) = averageAndHeight(height)
//    println("Average Height: $avg .. totalSumHeights : $totalheight")

    data class AverageMeasurements(var height: Double, var totalheight: Double)

   fun averageAndHeight(height: Collection<Double>): AverageMeasurements {
     var avg=height.average()
    var totalheight=height.sum()
    return AverageMeasurements(avg, totalheight)
}

// Given a list of Person objects, each with the attributes, name, age,
//  height and weight. Sort the list in order of descending age

//data class student(var name: String, var age: Int)
//
//fun createstudentlist(){
//    val student1 = student("Grace",20)
//    val student2 = student("Janet",20)
//    val student3 = student("Mercy",19)
//    val student4 = student("Linet",16)
//
//    val studentslist  = listOf(student1,student2,student3,student4)
//    println(studentslist)

 data class person( var name: String, var age: Int,var height: Double,var weight: Double )

fun People(){
    var FirstPerson =person ("cynthia", 22,1.65,56.0)
    var SecondPerson = person("Ishimwe", 20,1.70,57.2)
    var ThirdPerson = person("claire",32,1.90,70.2)

    val Personslist = listOf(FirstPerson,SecondPerson,ThirdPerson)
    val sorted = Personslist.sortedBy { person -> person.age }
     println(sorted)
}
