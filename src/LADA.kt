import Cars.*
class LADA (var model : String, var maxspeed : Double, marka : String, power : Double, price : Double) : Car(marka, power, price)
{
    public fun MaxSpeed()
    {
        try {
            print("Введите модель машины: ")
            model = readLine()!!.toString().toUpperCase()

            when (model) {
                "KALINA" -> println("Максимальная скорость $model 197 км/ч")
                "X-RAY" -> println("Максимальная скорость $model 176 км/ч")
                "PRIORA" -> println("Максимальная скорость $model 183 км/ч")
                "GRANTA" -> println("Максимальная скорость $model 195 км/ч")
                "VESTA" -> println("Максимальная скорость $model 175 км/ч")
                else -> println("Такой модели у $marka, я не знаю")
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