package text.kadai_021;


public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        for (String word : wordsToSearch) {
            String meaning = dictionary.search(word);
            if (meaning.equals("辞書に登録されていません。")) {
                System.out.println(word + "は辞書に存在しません");
            } else {
                System.out.println(word + "の意味は" + meaning);
            }
            
        }
	}

}
