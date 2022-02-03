public class RockPaperScissor {
    public static String rps(String p1, String p2) {return  (p1 == p2) ? "Draw!" : (p1 == "rock" && p2 == "scissors") || (p1 == "paper" && p2 =="rock") ||(p1 == "scissors" && p2 == "paper") ?   "Player 1 won!" : "Player 2 won!";}

    public static void main(String[] args) {
            System.out.println(rps("rock", "scissors"));
            System.out.println(rps("scissors", "scissors"));
            System.out.println(rps("paper", "scissors"));
    }
}
