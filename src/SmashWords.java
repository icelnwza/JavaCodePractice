import java.sql.Array;
import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        StringBuilder stringBuilder = new StringBuilder();
         String[] arr = words;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i] + " ";
            if(words[i] == words[words.length]){
                words[i] = words[i] + "";
            }
        }
        return arr.toString();

//        for (String str:words) {
//            if(words.length > 1){
//                stringBuilder.append(str).append("+");
//            }else
//                return str;
//        }
//        return stringBuilder.toString();
//        return "";
    }



    public static void main(String[] args) {
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
        System.out.println(smash(new String[] {"Bilal"}));

    }
}