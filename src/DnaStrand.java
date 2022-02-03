public class DnaStrand {
    public static String makeComplement(String dna) {
        //Your code
        String arr[] = dna.split("");
        String result = "";
        for(String dn : arr){
            switch(dn) {
                case "A" :{ dn = "T";
                    result+=dn;}
                    break;
                case "T" :{ dn = "A"; result+=dn;}
                    break;
                case "C" :{ dn = "G"; result+=dn;}
                    break;
                case "G" :{ dn = "C"; result+=dn;}
                    break;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
