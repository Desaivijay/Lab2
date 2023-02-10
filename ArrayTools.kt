import kotlin.random.Random

fun main() {

    var isContinue = true
    do {
        println("Array Tools")//giving the user options to select from different tools
        println("1. Encrypt")
        println("2. Array Average")
        println("3. Array Contains")
        println("4. Reverse Array")
        println("5. Quit")
        print("\nChoose an option: ")
        val option = readLine()!!.toInt()

        when (option) { //When user selects one option that function will be executed
            1 -> encrypt()
            2 -> arrayAvg()
            3 -> arrayContains()
            4 -> reverseArray()
            5 -> isContinue = false
            else -> println("Invalid option")
          }
    } while(isContinue)
}
fun encrypt() {
    print("Enter a string: ")
    val string = readLine()!!
    print("Enter a shift value: ")
    val shift = readLine()!!.toInt()
        println("Encrypted string: ${caesarCipher(string, shift)}")
    }
