package  Insects
open class Insect(_name: String)
{
    var name = _name
    var speed = 0.0
    var color = "Undefined"
    var eat = "Undefined"
    var habitat = "Undefined"

    constructor(_name: String, _color: String) : this(_name) {
        name = _name
        color = _color
    }
    constructor(_name: String, _speed: Double, _color: String, _eat: String, _habitat: String) : this(_name) {
        speed = _speed
        color = _color
        eat = _eat
        habitat = _habitat
    }
    open fun Name() {
        try {
            print("Введите название насекомого: ")
            name = readLine()!!.toString().toLowerCase()

            when (name) {
                "комар" -> println("Комар живёт 10 - 56 дней")
                "муха" -> println("Муха живёт 28 дней")
                "бабочка" -> println("Бабочка живёт 15 - 29 дней")
                "муравей" -> println("Муравей живёт 1 - 2 года")
                "богомол" -> println("Богомол живёт 1 год")
                else -> println("Таких насекомых не знаю....")
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
    open fun VesotEda()
    {
        var ves: Double
        var eat: Double
        try {
            do {
                print("Введите вес насекомого в кг (1 - 50):  ")
                ves = readLine()!!.toDouble()
            }while (ves <= 0 || ves >= 50)

            do {
                print("Введите кол-во еды(1 - 10): ")
                eat = readln()!!.toDouble()
            }while(eat <= 0 || eat >= 10)

            when{
                (eat >= 5) -> ves += 2
                (eat < 5) -> ves -= 2
            }

            println("Вес насекомого $ves")
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    open fun Speed()
    {
        try {
            print("Введите название насекомого: ")
            name = readLine()!!.toString().toLowerCase()

            when (name) {
                "комар" -> println("Скорость комара 1,6 – 2,4 км/ч")
                "муха" -> println("Скорость мухи 30 км/ч")
                "бабочка" -> println("Скорость бабочки 8-17 км/ч")
                "муравей" -> println("Скорость муравья 3,1 км/ч")
                else -> println("Таких насекомых не знаю....")
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    open fun GetInfo(){
        println("Информация о насекомом\nНазвание: $name Цвет: $color")
    }
}

