fun main(args: Array<String>) {
    // 1 задание
    println("Задание 1: ")
    var amount = 100.0
    val minkom = 35.0
    var comissiya = amount*0.75/100.0
    if (comissiya<minkom)
        comissiya=35.0
    amount-=comissiya
    println("Комиссия будет: "+ comissiya+" рублей. Сумма перевода: "+ amount)
    // 2 задание
    println("\nЗадание 2: ")
    val likes = 689
    if (likes % 10 == 1 && likes % 100 != 11)
        println("Понравилось " + likes +" человеку")
    else
        println("Понравилось " + likes +" людям")
    // 3 задание
    println("\nЗадание 3: ")
        val sum = 10001
        val pokup = true
        var skidka = when {
            sum in 1001..10000 -> 100
            sum >= 10001 -> (sum * 0.05).toInt()
            else -> 0
        }
        if (pokup && skidka!=0) {
            skidka += ((sum-skidka) * 0.01).toInt()
        }
        val finalAmount = sum - skidka
        println("Сумма покупки: " +sum+ " рублей, скидка: " +skidka+ " рублей")
        println("Итоговая сумма: " +finalAmount + " рублей")
}