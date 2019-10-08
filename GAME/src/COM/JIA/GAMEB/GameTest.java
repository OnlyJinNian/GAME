package COM.JIA.GAMEB;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] a = new Person[10];
		
		for(int i = 0;i<10;i++) {
			a[i] = new GunMan(200, 200, 3, 150);
		}
/*		Construction[] c =new Construction[3];
		for(int i = 0;i<10;i++) {
			c[i]= new Construction() {
			};
		}
		Player p = new Player("jia",100,10,10000,a[1],c) ;
*/
	}

}
