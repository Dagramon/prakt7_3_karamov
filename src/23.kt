fun main()
{
    try
    {
        print("Введите x: ")
        val x = readln().toDouble()
        print("Введите y: ")
        val y = readln().toDouble()
        when
        {
            (Math.abs(x) + Math.abs(y) <= 1.0 && x >= -1) || (x < -1 && y <= 1 && y >= -1 && Math.abs(x) + Math.abs(y) <= 3.0) ->
            {
                println("a - принадлежит")
            }
        }
        when
        {
            (Math.abs(x) + Math.abs(y) <= 2.0 && x <= 1 || x >= -1) || (y in -2.0..0.0 && x in -1.0..1.0) ->
            {
                println("б - принадлежит")
            }
        }
        when
        {
            (Math.pow(x, 2.0) + Math.pow(y, 2.0) <= 1) || (y in 0.0..2.0 && x in -1.0..1.0) ->
            {
                println("в - принадлежит")
            }
        }
        when
        {
            (x <= 1 && y <= 1 && Math.abs(x) + Math.abs(y) <= 2.0) ->
            {
                println("г - принадлежит")
            }
        }
    }
    catch(e:Exception)
    {
        println("Неверный тип данных")
    }
}