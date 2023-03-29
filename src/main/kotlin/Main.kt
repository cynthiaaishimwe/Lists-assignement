fun main() {
    val myList =  ListOfStrings(listOf("Cynthia","Magy","Carine","Grolia","Josh","Ishimwe","Kiki","Clara","Akii","Ukooo"))

    println( myList)
    var averageheight = listOf(1.65,1.67,1.70,1.80,1.90,2.00)
    println(averageheight)
    People()
}

fun ListOfStrings(name:List<String>):String{
  var list = name.filterIndexed{index, name->index %2==0}
    return list.toString()

}




  fun averageAndHeight(height: Collection<Double>): List<Double> {
    var avg=height.average()
    var totalheight=height.sum()
      var lst= listOf(avg,totalheight)
    return lst
}



 data class person( var name: String, var age: Int,var height: Double,var weight: Double )

fun People(){
    var FirstPerson =person ("cynthia", 22,1.65,56.0)
    var SecondPerson = person("Ishimwe", 20,1.70,57.2)
    var ThirdPerson = person("claire",32,1.90,70.2)

    val Personslist = listOf(FirstPerson,SecondPerson,ThirdPerson)
    val sorted = Personslist.sortedBy { person -> person.age }
     println(sorted)
}

