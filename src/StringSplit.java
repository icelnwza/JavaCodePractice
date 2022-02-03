public class StringSplit {
    public static String[] solution(String s) {


            StringBuilder stringBuilder = new StringBuilder();
            String result ="";
            s = (s.length() % 2 != 0) ? stringBuilder.append(s).append("_").toString() : s  ;
            String s1[] = s.split("");
            for (int i =0; i< s1.length ;i++) {
                result+=s1[i];
                if(i%2==1)result+=" ";

            }
        System.out.println(result);
        String s2[] = result.split("");

        return s2;
    }

    public static void main(String[] args) {
        solution("Hello World");
    }
}