package HashMaps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SpaceParseText implements ParseText {

    @Override
    public List<String> Handle(String text) {
        return Arrays.asList(text.split(" "));
    }

}

