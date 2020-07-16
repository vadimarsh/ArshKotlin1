import kotlin.math.abs

fun main() {
    val myMass = 71.2
    val myHeigth = 1.76
    val index = bodyMassIndex(myMass, myHeigth)
    val verdict = verboseIndex(index)
    println("Ваш рост = ${myHeigth} м.\nВаш вес = ${myMass} кг.\nИнтерпретация инедкса массы тела для вас: ${verdict}")

}

private fun verboseIndex(index: Double): String {
    return (when (index) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная масса тела"
        in 18.5..25.0 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела"
        in 30.0..35.0 -> "Ожирение резкое"
        in 35.0..40.0 -> "Ожирение"
        else -> "Очень резкое ожирение"
    })
}

fun bodyMassIndex(mass: Double, height: Double): Double {
    return abs(mass / (height * height))
}
