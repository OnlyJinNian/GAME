package COM.JIA.GAMEB;
//ÕÊº“¿‡
public class Player {
	private String name;
	private int maxNumber;
	private int nowNumber;
	private int resource;
	private Person[] p = new Person[10];
	private Construction[] c = new Construction[3];
	public Player() {}
	public Player(String name,int maxNumber,int nowNumber,int resource,Person p,Construction c) {
		this.name = name;
		this.maxNumber = maxNumber;
		this.nowNumber = nowNumber;
		this.resource  = resource;
		for(int i = 0;i<10;i++) {
			this.p[i] = p;
		}
		for(int i = 0;i<10;i++) {
			this.c[i] = c;
		}
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public int getNowNumber() {
		return nowNumber;
	}
	public void setNowNumber(int nowNumber) {
		this.nowNumber = nowNumber;
	}
	public int getResource() {
		return resource;
	}
	public void setResource(int resource) {
		this.resource = resource;
	}
	public Person[] getP() {
		
		return p;
	}
	public void setP(Person[] p) {
		this.p = p;
	}
	public Construction[] getC() {
		return c;
	}
	public void setC(Construction[] c) {
		this.c = c;
	}

}
