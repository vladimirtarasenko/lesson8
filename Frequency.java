package HashMaps;

import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Frequency {
    List list;
    private int wordCounter = 0;
    private String searchWord;


    public Frequency(List list) {
        this.list = list;
    }

    public void getWordFrequensy(List list) {
        System.out.println("Please enter the search word");
        searchWord = Main5.scanner.nextLine();
        for (Object word : list) {
            if (word.equals(searchWord)) {
                wordCounter += 1;
            }
        }
        if (wordCounter == 0) {
            System.out.println("The word you entered is absent in the text!");
            getWordFrequensy(list);
        } else {
            System.out.println("Word " + searchWord + " is found " + wordCounter + " times in this text");
        }
    }
}
