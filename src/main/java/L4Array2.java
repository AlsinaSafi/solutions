/*
Дан массив из 3 чисел с плавающей точкой.
Вывести в консоль сумму, произведение и среднее этих чисел.
ПРИМЕР
На входе (в коде)
[1.5, 2.0, 3.5]
На выходе (в консоле)
Сумма - 7.0
Произведение - 10.5
Среднее -  2.33
 */
public class L4Array2 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.0, 3.5}; /*задаём конкретные значения массива*/
        double a = array[0] + array[1] + array[2]; /*расчёт суммы элементов массива*/
        double b = array[0] * array[1] * array[2]; /*расчёт произведения элементов массива*/
        double c = (array[0] + array[1] + array[2]) / 3; /*расчёт среднего числа*/
        System.out.println(a); /*Печать суммы*/
        System.out.println(b); /*Печать произведения*/
        System.out.println(c); /*Печать среднего числа*/
    }
}