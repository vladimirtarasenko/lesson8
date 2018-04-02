package HashMaps;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GetUniqueWords implements UniqueWords {
    List list;

    public GetUniqueWords(List list) {
        this.list = list;
    }

    Set<String> uniqueWords = new HashSet<>();

    @Override
    public Set read(List list) {
        uniqueWords.addAll(list);
        TreeSet<String> word = new TreeSet<>(new SortSymbols());
        word.addAll(uniqueWords);
        return word;
    }
}
