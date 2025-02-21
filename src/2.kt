import kotlin.math.max
import kotlin.math.min

fun main()
{
    try
    {
        print("Введите x: ")
        val x = readln().toDouble()
        print("Введите K (целое): ")
        val K = readln().toInt()
        print("Введите M (целое): ")
        val M = readln().toInt()
        print("Введите N (целое): ")
        val N = readln().toInt()
        val Max:Int
        val Min:Int
        val y:Long
        when
        {
            K > N ->
            {
                Max = K; Min = N
            }
            else ->
            {
                Max = N; Min = K
            }
        }
        when
        {
            M == Max && M != Min ->
            {
                y = Math.round(Math.sin(Math.abs(x)) / Math.pow(x, 2.0))
            }
            M == Min && M != Max ->
            {
                y = Math.round(Math.sin(Math.abs(x)) / (Math.pow(x, 2.0) + 1))
            }
            else ->
            {
                y = -1
            }
        }
        println("y = $y")
    }
    catch(e:Exception)
    {
        println("Неверный тип данных")
    }
}