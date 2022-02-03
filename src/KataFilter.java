import java.util.*;
import java.util.stream.Collectors;

public class KataFilter {

    public static List filterList(final List list) {

        return  (List) list.stream().filter(l -> l.getClass().equals(Integer.class)).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(new Object[]{1,2,"a","b",4})));
    //    System.out.println(filterList(Arrays.asList(new Object[]{1,2,"a","b"})));
    }
}