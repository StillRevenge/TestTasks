package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    public static String FirstUpper(String word)// делаем первую букву слова заглавной
    {
        if(word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }


    public static void main(String[] args){
        String text;
        Scanner in = new Scanner(System.in);
        text =in.nextLine();
        int count = 0;
        ArrayList<String> words = new ArrayList<String>();
        for (String rezsent : text.split("[.!?]\\s*")) // разбиваем на предложения
        {
            for(String rezword : rezsent.split(" "))// разбиваем на слова
            {
                words.add(FirstUpper(rezword));
                count++;
            }
            System.out.println(count + " слов в предложении");
            Collections.sort(words);
            for(int j=0;j<words.size();j++)
            {
                System.out.println(words.get(j));
            }
            count =0;
            words.clear();
        }
    }
}
