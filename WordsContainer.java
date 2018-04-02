package HashMaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsContainer {
    Map<Object, Integer> hashMap = new HashMap<>();
    private List words;

    public WordsContainer(List words) {
        this.words = words;
    }

    public void getTotalWordsFrequensy(List words) {
        for (int i = 1; i < words.size(); i++) {
            Integer frequency = hashMap.get(words.get(i));
            hashMap.put(words.get(i), frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);
    }
}
