package check.code.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("Test.main");
        String[] words = new String[]{"1","2","3","4"};
        String lineWords = "";
        for (int i = 0; i < words.length; i++) {
            System.out.println("words["+i+"] = " + words[i]);
            if(words.length-1 != i){
                lineWords += words[i] + ":";
            }else{
                lineWords += words[i];
            }
        }
        System.out.println("lineWords = " + lineWords);
        System.out.println("===========================");

        //java.util.Arrays
        String result = stream(words).collect(Collectors.joining(":"));
        System.out.println("result = " + result);

        List<String> list = asList("banana", "apple", "momo");
        for (String s : list) {
            System.out.println("s1 = " + s);
        }

        List<String> list2 = new ArrayList<>(asList("banana", "apple", "tomato", "choco"));
        for (String s : list2) {
            System.out.println("s2 = " + s);
        }
        // java.util.Collection<E>
        List<String> strings = list2.stream()
                .map(element -> element.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("strings = " + strings);

        List<String> stringList = list2.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("stringList = " + stringList);
    }
}
