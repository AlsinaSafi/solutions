import java.util.Arrays;

/*
Дан массив целых чисел.
Поменять местами первый и последний элемент
и вывести полученный массив.

ПРИМЕР
На входе (в коде)
[0, 1, 2, 3, 4, 5]
На выходе (в консоли)
[5, 1, 2, 3, 4, 0]
 */
public class L4Array1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        array[0] = 5;
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
