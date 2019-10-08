package COM.JIA.GAMEB;
//±øÓª
public class Barracks extends Construction {
	public Barracks() {}
	public Barracks(int lifeValue,int needResource) {
		super(lifeValue, needResource);
	}
	public Person createGunMan(int a) {
		Person[] p = new Person[a];
		for(int i = 0; i<a;i++) {
			p[i] = new Sapper(200,200,3,150);
			return p[i];
		}
		return p[0];
		
	}

}
