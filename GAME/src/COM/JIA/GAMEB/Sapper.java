package COM.JIA.GAMEB;
//����
public class Sapper extends Person {
	public Sapper() {}
	public Sapper(int lifeValue,int attackPower,int needSupportting,int needResource) {
		super(lifeValue, attackPower, needSupportting, needResource);
	}
	

	@Override
	public void move(String direction, int step) {
		// TODO Auto-generated method stub
		System.out.println("�ñ���"+direction+"�ƶ�"+step+"��");
		
	}

	@Override
	public int attack(LifeThing th, Person p, Construction c) {
		// TODO Auto-generated method stub
		if(p != null) {
			System.out.println("��"+p+"��������");
			int a = p.getLifeValue()-getAttackPower();
			p.setLifeValue(a);
			return a;
		}if(c != null) {
			System.out.println("��"+c+"��������");
			int a = c.getLifeValue()-getAttackPower();
			c.setLifeValue(a);
			return a;
		}
		return 0;
	}
	public Construction createBuildings(Player p, Construction c) {
		int a=p.getResource()-c.getNeedResource();
		p.setResource(a);
		return c;
	}
	public int collectResources(Player p) {
		int a = p.getResource()+150;
		p.setResource(a);
		return a;
	}
	

}