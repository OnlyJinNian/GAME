package COM.JIA.GAMEB;
//护士
public class Nurse extends Person {
	public Nurse() {}
	public Nurse(int lifeValue,int attackPower,int needSupportting,int needResource) {
		super(lifeValue, attackPower, needSupportting, needResource);
	}

	@Override
	public void move(String direction, int step) {
		// TODO Auto-generated method stub
		System.out.println("该兵向"+direction+"移动"+step+"步");
	}

	@Override
	public int attack(LifeThing th, Person p, Construction c) {
		// TODO Auto-generated method stub
		if(p != null) {
			System.out.println("对"+p+"发动攻击");
			int a = p.getLifeValue()-getAttackPower();
			p.setLifeValue(a);
			return a;
		}if(c != null) {
			System.out.println("对"+c+"发动攻击");
			int a = c.getLifeValue()-getAttackPower();
			c.setLifeValue(a);
			return a;
		}
		return 0;
		
	}
	public int cure(Person p) {
		int a = p.getLifeValue()+100;
		p.setLifeValue(a);
		return a;
	}

}
