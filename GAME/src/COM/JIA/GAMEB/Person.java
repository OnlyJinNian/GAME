package COM.JIA.GAMEB;
//ÈË¿ÚÀà
public abstract  class Person implements LifeThing,Attackable,Moblie {
	private int lifeValue;
	private int attackPower;
	private int needSupportting;
	private int needResource;
	public Person () {}
	public Person(int lifeValue,int attackPower,int needSupportting,int needResource) {
		this.attackPower = attackPower;
		this.lifeValue = lifeValue;
		this.needResource = needResource;
		this.needSupportting = needSupportting;
	}
	public Person(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getLifeValue() {
		return lifeValue;
	}
	public void setLifeValue(int lifeValue) {
		this.lifeValue = lifeValue;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getNeedSupportting() {
		return needSupportting;
	}
	public void setNeedSupportting(int needSupportting) {
		this.needSupportting = needSupportting;
	}
	public int getNeedResource() {
		return needResource;
	}
	public void setNeedResource(int needResource) {
		this.needResource = needResource;
	}

}
