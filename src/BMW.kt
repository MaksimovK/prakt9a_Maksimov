import Cars.*
class BMW (var model : String, var maxspeed : Double, marka : String, power : Double, price : Double) : Car(marka, power, price)
{
    public fun MaxSpeed()
    {
        try {
            print("Введите модель машины: ")
            model = readLine()!!.toString().toUpperCase()

            when (model) {
                "I" -> println("Максимальная скорость $model 200 км/ч")
                "X" -> println("Максимальная скорость $model 250 км/ч")
                "M" -> println("Максимальная скорость $model 300 км/ч")
                else -> println("Такой модели у BMW, я не знаю")
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    public fun Type()
    {
        try {
            print("Введите модель машины: ")
            var type = readLine()!!.toString().toUpperCase()

            when (model) {
                "ЛЕГКОВЫЕ" -> println("Легковые модели $marka i, x, m и 1 - 8 serious")
                "ГРУЗОВЫЕ" -> println("$marka не делает грузовые авто")
                else -> println("Таких типов авто я не знаю")
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }

    override fun GetInfo() {
        println("Информация о машине\nМарка авто:" +
                    " $marka\n Модель: $model")
    }
}