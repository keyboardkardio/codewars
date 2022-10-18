import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        int length = s.length();
        if (length % 2 != 0) {
          s = s.concat("_");
        }
      
        List<String> listOfTwo = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 2) {
          listOfTwo.add(s.substring(i, Math.min(s.length(), i + 2)));
        }
      
        String[] results = new String[listOfTwo.size()];
        results = listOfTwo.toArray(results);
          
        return results;
    }
}