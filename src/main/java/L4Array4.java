/*
Дан массив из 5 целых чисел.
Вывести в консоль результат деления суммы элементов массива на их количество.

ПРИМЕР
На входе (в коде)
[1, 2, 3, 4, 5]
На выходе (в консоле)
3
*/

public class L4Array4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; /* Объявляем массив и присваеваем ему значения*/
        double avarage = 0; /* Объявляем переменную avarage и присваиваем ей значение 0*/
        int sum = 0; /* Объявляем переменную sum и присваиваем ей значение 0*/
        for (int i = array[0]; i < array.length; i++){ /* Вычисляем сумму массива*/
            sum = sum + array [i];
        }
        avarage =  sum / array.length +1; /* Вычисляем среднее число массива*/
        System.out.println(avarage); /* Выводим среднее число в консоль*/
    }
}
