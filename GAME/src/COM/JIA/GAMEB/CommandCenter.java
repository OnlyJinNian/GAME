package COM.JIA.GAMEB;
//Ö¸»ÓÖÐÐÄ
public class CommandCenter extends Construction {
	public CommandCenter() {}
	public CommandCenter(int lifeValue,int needResource) {
		super(lifeValue, needResource);
	}
	public Person createSpper(int a) {
		Person[] p = new Person[a];
		for(int i = 0; i<a;i++) {
			p[i] = new Sapper(200,70,2,100);
			return p[i];
		}
		return p[0];
		
	}

}
