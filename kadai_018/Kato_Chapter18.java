package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String giveName = "";
	public String address = "東京都中野区○×";
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + giveName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println("");
	}
}
