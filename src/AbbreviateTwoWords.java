public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String n[] = name.split(" ");
        String result = "";
        for(int i = 0; i < n.length ; i++){
            result += (i==0)? "":"." ;
            result += n[i].substring(0,1).toUpperCase();
        }

        return result;
    }
    public static void main(String[] args) {
            System.out.println(abbrevName("Harry James Potter"));
    }
}

