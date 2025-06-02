package text.kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName = "Kato"; // 姓を表す
	public String givenName; // 名を表す
	public String address = "東京都中野区〇×区";

	
	// 共通の紹介を出力する
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	// 個別の紹介を出力する
	abstract void eachIntroduce();
	
	
	// 紹介を実行する
	public void execIntroduce() {
		commonIntroduce(); // 共通の紹介を実行
		eachIntroduce(); // 個別の紹介を実行
	}
	
}
