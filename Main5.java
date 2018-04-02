package HashMaps;

import java.util.*;

public class Main5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InputText inputText = new ConsoleInputText();
        ParseText spt = new SpaceParseText();
        String str = inputText.read();
        List<String> words = spt.Handle(str);
        UniqueWords uniqueWords = new GetUniqueWords(words);
        for (Object word : uniqueWords.read(words)) {
            System.out.println(word);
        }
        Frequency word = new Frequency(words);
        word.getWordFrequensy(words);
        WordsContainer allTheWordsFrequensy = new WordsContainer(words);
        System.out.println("Would you like to see the total word frequensy in text(press <y> or <n>) ?");
        if (scanner.nextLine().equals("y")) {
            allTheWordsFrequensy.getTotalWordsFrequensy(words);
        }
    }
}
