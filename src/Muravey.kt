import Insects.*
class Muravey(var kolvolapok: Int, var kolvovoloskov: Int, name: String, speed: Double, color: String, eat: String, habitat: String) : Insect(name, speed, color, eat, habitat) {

    public fun Info() {
        println("$name может поднять в 100 раз больше совего веса")
    }

    public fun NametoMuravey() {
        println("$name - одно из самых полезных")
    }

    override fun GetInfo(){
        println("Название насекомого $name")
        println("Цвет $name $color")
        println("Скорость $name $speed")
    }
}
