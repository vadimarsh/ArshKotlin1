fun main() {
    var publishedAgo: Long

    publishedAgo = 39600 //11 часов
    var verdict = verboseTime(publishedAgo)
    println("результат: " + verdict)

    publishedAgo = 7257600 //3 месяца назад
    verdict = verboseTime(publishedAgo)
    println("результат: " + verdict)
}

fun verboseTime(secs: Long): String {
    val mins: Long = 60
    val hours = mins * 60
    val days = hours * 24
    val weeks = days * 7
    val months = weeks * 4
    val years = months * 12

    val result = when (secs) {
        in 0..59 -> "менее минуты назад"
        in mins..hours -> {
            "${secs / mins} минут назад"
        }
        in hours..days -> {
            "${secs / hours} часов назад"
        }
        in days..weeks -> {
            "${secs / (days)} дней назад"
        }
        in weeks..months -> {
            "${secs / (weeks)} недель назад"
        }
        in months..years -> {
            "${secs / (months)} месяцев назад"
        }
        else -> "больше года назад"
    }

    //val mins = secs/3600;

    return result
}
