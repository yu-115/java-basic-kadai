package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ジャンケンの手をr、s、pのどれかで入力してください");
			String myChoice = sc.next();
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				sc.close();
				return myChoice;
			} else {
				System.out.println("入力エラー。正しいジャンケンの手を入力してください");
			}
		}
	}
	
	public String getRandom() {
		String[] hand = {"r", "s", "p"};
		int n = (int)(Math.floor(Math.random() * 3));
		return hand[n];
	}
	
	public void playGame() {
		HashMap<String, String> rsp = new HashMap<String, String>();
		rsp.put("r", "グー");
		rsp.put("s", "チョキ");
		rsp.put("p", "パー");
		
		String my = getMyChoice();
		String you = getRandom();
				
		System.out.println("自分の手は" + rsp.get(my) + "です");
		System.out.println("相手の手は" + rsp.get(you) + "です");
		
		if (rsp.get(my).equals("グー")) {
			switch(rsp.get(you)) {
			case "グー"   -> System.out.println("あいこです");
			case "チョキ" -> System.out.println("自分の勝ちです");
			case "パー"   -> System.out.println("自分の負けです");
			}
		}
		if (rsp.get(my).equals("チョキ")) {
			switch(rsp.get(you)) {
			case "グー"   -> System.out.println("自分の負けです");
			case "チョキ" -> System.out.println("あいこです");
			case "パー"   -> System.out.println("自分の勝ちです");
			}
		}
		if (rsp.get(my).equals("パー")) {
			switch(rsp.get(you)) {
			case "グー"   -> System.out.println("自分の勝ちです");
			case "チョキ" -> System.out.println("自分の負けです");
			case "パー"   -> System.out.println("あいこです");
			}
		}

		
	}

}
