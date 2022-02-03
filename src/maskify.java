public class maskify {
    public static String maskify(String str) {

        String strrr = "";
        if (str.length() <= 4) return str;
        String sub = str.substring(str.length() - 4);
            for (int i = 1; i <= str.length() - 4; i++) {
            strrr += "#";
            }
            return   strrr = strrr + sub;

    }


        public static void main(String[] args) {
             maskify("4556364607935616");
             maskify(     "64607935616");
             maskify("1");
             maskify(                "");
             System.out.println(maskify("4556364607935616"));

        }

    }
