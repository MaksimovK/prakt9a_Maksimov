package  Cars
open class Car(_marka : String)
{
    var marka = _marka
    var power = 0.0
    var price = 0.0

    constructor(_marka: String, _power : Double, _price : Double): this(_marka)
    {
        marka = _marka
        power = _power
        price = _price
    }

    constructor(_marka: String, _price : Double) : this(_marka)
    {
       marka = _marka
       price = _price
    }

    open fun Price()
    {
        try {
            print("Введите марку автомобиля: ")
            marka = readLine()!!.toString().toUpperCase()

            when (marka) {
                "BMW" -> println("$marka стоит 85 000 - 21 000 000")
                "MERСEDES" -> println("$marka стоит 80 000 - 36 500 000")
                "LADA" -> println("$marka стоит от 20 000 - 2 000 000")
                "TOYOTA" -> println("$marka стоит 50 000 - 15 000 000")
                "HYUNDAI" -> println("$marka стоит 100 000 - 6 000 000")
                "KIA" -> println("$marka стоит 110 000 - 8 500 000")
                else -> println("Такой марки авто не знаю")
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    open fun Power()
    {
        try {
            print("Введите мощность двигателя в Киловатт-час: ")
            power = readLine()!!.toDouble()

            println("Мощность лошадиных сил: ${power / 0.73549875}")
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }

    open fun Marka()
    {
        try {
            var money: Double
            do {
                print("Введите сколько у вас есть денег на машину: ")
                money = readLine()!!.toDouble()
            } while (money < 0)

            when {
                (money > 50000 && money < 100000) -> println("Вы можете себе позволить LADA, TOYOTA, BMW")
                (money > 100000 && money < 200000) -> println(
                    "Вы можете себе позволить" +
                            " LADA, TOYOTA, HYUNDAI, BMW, MERCEDES, KIA"
                )

                (money > 200000) -> println("Вы можете позволить машину почти любой марки")
                else -> println(
                    "Вам хватит денег только на " +
                            "машину-собаку из фильма Тупой и ещё тупее"
                )
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    open fun GetInfo() {
        println("Информация о машине\nМарка авто:" +
                    " $marka\n Мощность двигателя: $power\n Стоимость: $price")
    }
}
