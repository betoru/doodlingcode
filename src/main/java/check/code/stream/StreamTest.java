package check.doodlingCode.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("### StreamTest.main ###");

        System.out.println("=========================== START Test Data Process Of Array ===========================");
        String[] arrayWords = new String[]{"1","2","3","4"};
        String arrayWordsResult = "";
        for (int i = 0; i < arrayWords.length; i++) {
            if(arrayWords.length-1 != i){
                arrayWordsResult += arrayWords[i] + ":";
            }else{
                arrayWordsResult += arrayWords[i];
            }
        }
        System.out.println("arrayWordsResult = " + arrayWordsResult);
        System.out.println("=========================== END Test Data Process Of Array ===========================");


        System.out.println("=========================== START Test Data Process Stream Of Array ===========================");
        String[] streamWords = new String[]{"1","2","3","4"};
        String result = stream(streamWords).collect(Collectors.joining(":"));
        System.out.println("result = " + result);
        System.out.println("=========================== END Test Data Process Stream Of Array ===========================");

        List<String> list = asList("banana", "apple", "tomato", "choco");
        for (String s : list) {
            System.out.println("s1 = " + s);
        }

        System.out.println("=========================== START Test Data Process Stream Of List ===========================");
        List<String> list2 = asList("banana", "apple", "tomato", "choco");
        List<String> streamList = list2.stream()
              .map(element -> element.toUpperCase())
              .sorted()
              .collect(Collectors.toList());
        System.out.println("streamList = " + streamList);

        List<String> streamList2 = list2.stream()
              .map(String::toUpperCase)
              .sorted()
              .collect(Collectors.toList());
        System.out.println("streamList2 = " + streamList2);
        System.out.println("=========================== END Test Data Process Stream Of List ===========================");
    }
}
