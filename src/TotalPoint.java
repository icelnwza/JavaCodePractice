import java.util.Arrays;

public class TotalPoint {
    public static int points(String[] games) {

        int point =0;
        for (int i = 0 ; i < games.length; i++) {
            String score[] = games[i].split(":");
            int a = Integer.parseInt(score[0]);
            int b = Integer.parseInt(score[1]);
            if(a>b)point +=3;
            if(a==b)point +=1;
            if(a<b)point +=0;
        }

    return point;
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }
}
