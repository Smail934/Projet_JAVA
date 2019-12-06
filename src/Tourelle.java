
public abstract class Tourelle {
	
	protected int PosX;
	protected int PosY;
	protected int Range;
	protected double Degats;
	protected String Type;
	protected int Prix;
	protected int PrixRemboursement;
	protected Ennemy target;
	protected int CoutAmelioration;
	protected double TmpsRechargement;
	protected long DerniereAttaque;
	protected static final double Amelioration =1.2;
	protected int level=1;
	protected static int lvlMax = 4;
	
	
	
	public Tourelle(int posX, int posY) {
		PosX = posX;
		PosY = posY;
		DerniereAttaque=0;
		
	}
	public boolean canAttaque(){ // renvoie true si la tourelle peut attaquer et false sinon.
		if( (System.currentTimeMillis()-DerniereAttaque)/1000.0 >= TmpsRechargement){

			return true;
		}
		else
			return false;
	}
	
	public boolean upgrade() {
		if(level < lvlMax && Joueur.getJoueur().getMoney()>=CoutAmelioration){
			level++;
			Joueur.getJoueur().addMoney(-1*CoutAmelioration);
			return true;
		}
		return false;
	}

	public int getPosX() {
		return PosX;
	}

	public void setPosX(int posX) {
		PosX = posX;
	}

	public int getPosY() {
		return PosY;
	}

	public void setPosY(int posY) {
		PosY = posY;
	}

	public int getRange() {
		return Range;
	}

	public void setRange(int range) {
		Range = range;
	}

	public double getDegats() {
		return Degats;
	}

	public void setDegats(double degats) {
		Degats = degats;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	public abstract void hit (double Degats);
	public abstract void Stunt();
	
}
