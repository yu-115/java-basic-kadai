package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンスの作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//検索する単語をセッターを通して配列に追加
		String[] searchArray = new String[4];
		searchArray[0] = "apple";
		searchArray[1] = "banana";
		searchArray[2] = "grape";
		searchArray[3] = "orange";
		dictionary.setSearchArray(searchArray);
		
		//検索用のメソッドを実行
		dictionary.checkWord();

	}

}
