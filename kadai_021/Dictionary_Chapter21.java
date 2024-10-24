package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//コレクションの生成
	HashMap<String,String> dictionaryMap = new HashMap<String,String>();

	//検索用の配列の宣言と、別クラスから内容を変更する為のセッター
	private String[] searchArray = new String[4];
	public void setSearchArray(String[] searchArray) {
		this.searchArray = searchArray;
	}
	
	//辞書に単語（キー）と意味（値）を追加するコンストラクタ
	public Dictionary_Chapter21() {
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウイ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");
	}
	
	//検索した単語が辞書に含まれるかどうか検索するメソッド
	public void checkWord() {
		for( String search : searchArray ) {
			if(dictionaryMap.containsKey(search)) {
				System.out.println(search + "の意味は" + dictionaryMap.get(search));
			} else {
				System.out.println(search + "は辞書に存在しません");
			}
		}
	}

}
