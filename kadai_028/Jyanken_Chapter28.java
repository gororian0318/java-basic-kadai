package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            choice = scanner.nextLine();
            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break;
            } else {
                System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
            }
        }

        return choice;
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int index = (int)Math.floor(Math.random() * 3);
        return choices[index];
    }

    public void playGame(String myChoice, String enemyChoice) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(enemyChoice));

        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && enemyChoice.equals("s")) ||
            (myChoice.equals("s") && enemyChoice.equals("p")) ||
            (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
