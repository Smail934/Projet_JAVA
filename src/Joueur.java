
public class Joueur {
	private static int money = 0;
	private static int vies;
	private static final int MONEYDEPART = 200;
	private static final int VIESDEPART = 16;
	private static Joueur instance = null;
	
	public static synchronized Joueur getJoueur(){
		if(instance ==null){
			instance = new Joueur();
		}
		return instance;
	}
	
	
	public  void reset(){
		vies = VIESDEPART;
		money = MONEYDEPART;
	}
	
	public  void addMoney(int montant){
		money += montant;
	}
	public void addVies(){
		vies++;
	}
	public void decreaseVies(){
		vies--;
	}
	
	public int getVies(){
		return vies;
	}
	public int getMoney(){
		return money;
	}
	
	
	
}
