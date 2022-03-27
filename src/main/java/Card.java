
public class Card {

	private String name;
	private String kana;
	private String cost;
	private String kinds;
	private String set;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKana() {
		return kana;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public Card(String name, String kana, String cost, String kinds, String set) {
		super();
		this.name = name;
		this.kana = kana;
		this.cost = cost;
		this.kinds = kinds;
		this.set = set;
	}
	
}
