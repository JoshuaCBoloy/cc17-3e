fun main() {
    val age = 20
    val layers = 5
    printCandles(age)
    printTopCake(age)
    printBottomCake(age, layers)
}

fun printTopCake(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }    
    println()  
 
    print(" ") 
    repeat(age) {
        print("|")
    }    
    println()
}


fun printBottomCake(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}
