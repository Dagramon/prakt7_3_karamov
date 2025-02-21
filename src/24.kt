fun main()
{
    try
    {
        print("Введите d1: ")
        val d1 = readln().toDouble()
        print("Введите d2: ")
        val d2 = readln().toDouble()
        when
        {
            d1 <= 0 && d2 <= 0 -> println("Диагонали не могут быть меньше либо равны нулю")
            else ->
            {
                val s = Math.round((d1 * d2) / 2)
                println("S = $s")
            }
        }
    }
    catch(e:Exception)
    {
        println("Неверный тип данных")
    }
}