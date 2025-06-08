package text.kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();

        String myChoice = game.getMyChoice();
        String enemyChoice = game.getRandom();

        game.playGame(myChoice, enemyChoice);
    }
}
