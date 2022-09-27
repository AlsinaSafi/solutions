/*
Задание: Завести строку в нижнем регистре.
Вывести в консоль эту строку с заглавными
первой и последней буквами.
Например: java -> JavA
 */
public class L4LastQuiz {
    public static void main(String[] args) {
        String word = "russian";
        char[] array = word.toCharArray();
        array[0] = 'R';
        array[array.length - 1] = 'N';
        String newWord = new String(array);
        System.out.println(newWord);
    }
}
