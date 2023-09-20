package extensions

fun String?.getNotEmptyString(): String {

    var input = this
    while (input.isNullOrBlank()) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.trim()
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while (input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("숫자를 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}