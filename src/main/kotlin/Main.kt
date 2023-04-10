fun main() {
    println(commission("MasterCard", 4000, 0))

    countPeople(4111)
    println(calculateDiscount(20_000, false))
}

fun commission(typeCard: String, amount: Int, previousForMonth: Int): Int { // 1 DZ
    if (typeCard == "MasterCard" || typeCard == "Maestro") {
        return if (amount > 150_000 || amount + previousForMonth > 600_00) {
            println("Превышен лимит")
            -1
        } else if (amount in 301..74999) {
            println("Сумма в рублях:")
            0
        } else {
            println("Сумма в рублях:")
            (amount * 0.006).toInt() + 20
        }
    } else if (typeCard == "Visa" || typeCard == "Мир") {
        return if (amount > 150_000 || amount + previousForMonth > 600_000) {
            println("Превышен лимит")
            -1
        } else {
            if ((amount * 0.0075).toInt() < 35) {
                println("Сумма в рублях:")
                35
            } else {
                println("Сумма в рублях:")
                (amount * 0.0075).toInt()
            }
        }
    } else if (typeCard == "VK Pay") {
        return if (amount > 15_000 || amount + previousForMonth > 40_000) {
            println("Превышен лимит")
            -1
        } else {
            println("Сумма в рублях:")
            0
        }
    } else println("Такой карты нет")
    return -777
}

fun countPeople(count: Int) { //  2 DZ

    if (count == 11 || count % 100 == 11) {
        println("Понравилось: $count людям")
    } else if (count == 1 || count % 10 == 1) {
        println("Понравилось: $count человеку")
    } else {
        println("Понравилось: $count людям")
    }

}

fun calculateDiscount(amount: Int, regularUser : Boolean): Int {

    return if (amount in 1001..9999 && regularUser) {
        val discount = (amount - 100)
        val discount100 = 100
        val discountOne = ((discount) * 0.01).toInt()
        println("Ваша скидка 100 рублей + $discountOne и того со скидкой: ")
        amount - discount100 - discountOne

    } else if (amount >= 10_000 && regularUser) {
        val discountFive = (amount * 0.05).toInt()
        val discountOne = (( amount -discountFive) * 0.01).toInt()
        println("Вашка скидка $discountFive +  $discountOne и того со скидкой: ")
         amount - discountFive - discountOne

    } else  if (amount in 1001..9999 ){
        println("Ваша скидка 100 рублей и того со скидкой:")
        amount - 100
    }
    else if (amount >= 10_000 ){
        println("Вашка скидка ${(amount * 0.05).toInt()} и того со скидкой: ")
        amount - (amount * 0.05).toInt()
    } else{
        println("Скидки нет!")
        0
    }

}


