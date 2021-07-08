package ru.freeIt.homework.collectionHw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Имеется текст. Следует составить для него частотный словарь.
public class Query4 {
    public static void main(String[] args) throws IOException {
        List<String> strWordsList = new ArrayList<String>();
        String[] strWordsArr = null;
        String localStr = null;
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/ru/freeIt/homework/collectionHw/resource/text.txt"));
        while(bufferedReader.ready()) {
            localStr = bufferedReader.readLine().replaceAll("\\p{P}", "").toLowerCase(Locale.ROOT);
            strWordsArr = localStr.split(" ");
            for (int i = 0; i < strWordsArr.length; i++){
                if (!strWordsArr[i].equals(""))
                    strWordsList.add(strWordsArr[i]);
            }
        }

        Map<String, Integer> valueOfWord = new TreeMap<>();

        for (int i = 0; i < strWordsList.size(); i++){
            if (!valueOfWord.containsKey(strWordsList.get(i))) {
                valueOfWord.put(strWordsList.get(i), 0);
            } else{
                valueOfWord.put(strWordsList.get(i), valueOfWord.get(strWordsList.get(i)) + 1);
            }
        }

        Set<String> keysWord = valueOfWord.keySet();
        Iterator<String> stringIterator = keysWord.iterator();
        while (stringIterator.hasNext()){
            String index = stringIterator.next();
            System.out.println(index + " " + valueOfWord.get(index));
        }
    }
}
