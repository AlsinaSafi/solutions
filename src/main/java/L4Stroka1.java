import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/*
1. Дана строка длиной больше 5 символов.
Вывести в консоль подстроку из первых 3 символов и последних 3 символов.

ПРИМЕР
На входе (в коде)
“Amazing”
На выходе
Первые 3 символа - Ama
Последние 3 символа - ing

 */
public class L4Stroka1 {
        public static void main(String[] args) {
                String word = "Amazing";
                String newWord1 = word.substring(0, 3);
                String newWord2 = word.substring(word.length() - 3, word.length());
                System.out.println(newWord1);
                System.out.println(newWord2);
        }
}