package Task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)
    {
        String sent, word;
        System.out.println("введите текст");
        Scanner in =new Scanner(System.in);
        sent = in.nextLine();
        System.out.println("введите слово на проверку");
        word = in.nextLine();
        int count=0;
        for (String rezsent : sent.split("[.!?]\\s*"))//разбиваем на предложения
        {
            for(String rezword : rezsent.split("\\s+"))//разбиваем на слова
            {
                if (rezword.equalsIgnoreCase(word))//сравниваем
                {
                    count++;
                }

            }
        }
        System.out.println("слово встречается "+count+" раз");
    }
}
