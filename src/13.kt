fun main()
{
    try
    {
        print("Введите k: ")
        val k = readln().toDouble()
        print("Введите b: ")
        val b = readln().toDouble()
        print("Введите a: ")
        val a = readln().toDouble()
        val D = Math.pow(b, 2.0) - 4 * k * (-a)
        when
        {
            D < 0 -> println("Точек пересечения нет")
            D == 0.0 ->
            {
                val x = (-b + Math.sqrt(D)) / 2 * k
                val y = k * x + b
                println("Точка пересечения : (${Math.round(x)};${Math.round(y)})")
            }
            else ->
            {
                val x1 = (-b + Math.sqrt(D)) / 2 * k
                val x2 = (-b - Math.sqrt(D)) / 2 * k
                val y1 = k * x1 + b
                val y2 = k * x2 + b
                println("Точки пересечения: (${Math.round(x1)};${Math.round(y1)}) и (${Math.round(x2)};${Math.round(y2)})")
            }
        }
    }
    catch(e:Exception)
    {
        println("Неверный тип данных")
    }
}