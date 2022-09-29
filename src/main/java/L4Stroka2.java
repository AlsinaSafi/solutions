/*
Дана строка нечетной длины.
Вывести в консоль символ,
который находится ровно посередине слова.

ПРИМЕР
На входе (в коде)
“Proto”
На выходе
Буква посередине - o
*/
public class L4Stroka2 {
    public static void main(String[] args) {
        String word = "Proto";                        /* Объявляем строку*/
        char[] array = word.toCharArray();            /* Преобразуем строку в массив*/
        System.out.println(array[array.length /2]);   /* Выводим символ, имеющий индекс по середине*/
    }
}
