package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> fruitDictionary = new HashMap<String, String>();{
	
	fruitDictionary.put("apple","りんご");
	fruitDictionary.put("peach","桃");
	fruitDictionary.put("banana","バナナ");
	fruitDictionary.put("lemon","レモン");
	fruitDictionary.put("pear","梨");
	fruitDictionary.put("kiwi","キウィ");
	fruitDictionary.put("strawberry","いちご");
	fruitDictionary.put("grape","ぶどう");
	fruitDictionary.put("muscat","マスカット");
	fruitDictionary.put("cherry","さくらんぼ");
	
	}
	
    public String search(String word) {
        if (fruitDictionary.containsKey(word)) {
            return fruitDictionary.get(word);
        } else {
            return "辞書に登録されていません。";
        }
    }

}
