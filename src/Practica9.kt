import Insects.Insect as NewInsect
import ClassInfo.Scholl as NewSchool
import ClassInfo.ClassRoom as NewClassRoom
import Cars.Car as NewCar

fun main()
{
    var MuraveyOne = Muravey(6, 2, "Рыжый лесной муравей", 3.1, "черный с рыжым брюком", "сок растений", "леса");
    MuraveyOne.NametoMuravey()
    MuraveyOne.Name()
    MuraveyOne.Info()
    MuraveyOne.Speed()
    MuraveyOne.VesotEda()
    var MuraveyTom = NewInsect("Огненный муравей", "Огненно-крассный")
    var MuraveyBred = NewInsect("Чёрный муравей", "Черный")
    var MuraveyIgor = NewInsect("Тропический муравей", 3.1, "Бурый", "Мелкие насекомые", "Тропический лес")

    println("Название: ${MuraveyTom.name} Цвет: ${MuraveyTom.color} ")
    println("Название: ${MuraveyBred.name} Цвет: ${MuraveyBred.color} ")
    println("Название: ${MuraveyIgor.name} Скорость: ${MuraveyIgor.speed} Цвет: ${MuraveyIgor.color} " +
            "Еда: ${MuraveyIgor.eat} Место обитания: ${MuraveyIgor.habitat}")

    var MyxaOne = Myxa(6, 2, "Муха-Цеце", 30.0, "Бурый", "кровь животных", "Тропические леса");
    MyxaOne.Name()
    MyxaOne.CanFly()
    MyxaOne.Speed()
    MyxaOne.Time()
    MyxaOne.VesotEda()
    var MyxaTom = NewInsect("Огненный муравей", "Огненно-крассный")
    var MyxaBred = NewInsect("Чёрный муравей", "Черный")
    var MyxaIgor = NewInsect("Тропический муравей", 30.2, "Бурый", "Мелкие насекомые", "Тропический лес")

    println("Название: ${MyxaTom.name} Цвет: ${MyxaTom.color} ")
    println("Название: ${MyxaBred.name} Цвет: ${MyxaBred.color} ")
    println("Название: ${MyxaIgor.name} Скорость: ${MyxaIgor.speed} Цвет: ${MyxaIgor.color} " +
            "Еда: ${MyxaIgor.eat} Место обитания: ${MyxaIgor.habitat}")

    var InsectOne = NewInsect("Бабочка")
    InsectOne.Name()
    InsectOne.Speed()
    InsectOne.VesotEda()

    var LADAXray = LADA("X-ray", 176.0, "LADA", 78.0, 605000.0)
    LADAXray.Type()
    LADAXray.MaxSpeed()
    LADAXray.GetInfo()
    LADAXray.Price()
    LADAXray.Power()

    var LADAPriora = NewCar("LADA")
    var LADAKalina = NewCar("LADA", 125000.0)
    var LADAGranta = NewCar("LADA", 98.0, 215000.0)

    println("Марка: ${LADAPriora.marka}")
    println("Марка: ${LADAKalina.marka} Стоимость: ${LADAKalina.price}")
    println("Марка: ${LADAGranta.marka} Мощность двигатедя: ${LADAGranta.power} Стоимость: ${LADAGranta.price}")

    var BMWX6 = LADA("X6", 230.0, "BMW", 300.0, 1200000.0)
    BMWX6.Type()
    BMWX6.MaxSpeed()
    BMWX6.GetInfo()
    BMWX6.Price()
    BMWX6.Power()

    var BMWX = NewCar("BMW")
    var BMWI = NewCar("BMW", 6000000.0)
    var BMWM = NewCar("BMW", 455.0, 6200000.0)

    println("Марка: ${BMWX.marka}")
    println("Марка: ${BMWI.marka} Стоимость: ${BMWI.price}")
    println("Марка: ${BMWM.marka} Мощность двигатедя: ${BMWM.power} Стоимость: ${BMWM.price}")

    var CarOne = NewCar("BMW")
    CarOne.Marka()
    CarOne.Power()
    CarOne.Price()

    var School = NewSchool("Школа №5", "Средняя общеобразовательная школа")
    var Classroom = NewClassRoom(305, "Кабинет географии")

    println("Название школы: ${School.name} Информация: ${School.info} ")
    println("Кабинет №: ${Classroom.number} Информация: ${Classroom.info} ")

}
