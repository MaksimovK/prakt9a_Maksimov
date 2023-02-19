package ClassInfo

class Scholl(var name: String, var info: String)
{
    fun Print()
    {
        println("Название школы: $name \nИнформация: $info")
    }
}

class ClassRoom(var number: Int, var info: String)
{
    fun Print()
    {
        println("Кабинет №: $number \nИнформация: $info")
    }
}