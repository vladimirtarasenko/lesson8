package HashMaps;

import java.util.Comparator;

public class SortSymbols implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            if (!o1.equals(o2))
                return 1;
            else return 0;
        } else if (o1.length() > o2.length())
            return 1;
        else
            return -1;
    }
}
