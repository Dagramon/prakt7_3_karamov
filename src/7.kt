fun main()
{
    try
    {
        print("Введите a: ")
        val a = readln().toDouble()
        print("Введите b: ")
        val b = readln().toDouble()
        print("Введите c: ")
        val c = readln().toDouble()
        when
        {
            a <= 0 || b <= 0 || c <= 0 -> println("Стороны не могут быть меньше либо равны нулю")
            a + b > c && b + c > a && a + c > b ->
            {
                val p = (a + b + c)/2
                val s = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)))
                println("S = $s")
            }
            else -> println("Сумма любых двух сторон должна быть больше третьей стороны")
        }
    }
    catch(e:Exception)
    {
        println("Неверный тип данных")
    }
}