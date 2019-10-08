package COM.JIA.GAMEB;
//½¨ÖþÀà
public abstract class Construction implements LifeThing {
	private int lifeValue;
	private int needResource;
	public Construction  () {}
	public Construction  (int lifeValue,int needResource) {}
	public int getLifeValue() {
		return lifeValue;
	}
	public void setLifeValue(int lifeValue) {
		this.lifeValue = lifeValue;
	}
	public int getNeedResource() {
		return needResource;
	}
	public void setNeedResource(int needResource) {
		this.needResource = needResource;
	}
	

}
