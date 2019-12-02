import java.sql.Time;

public class Ennemy {
	protected double HP; // Le nombre de point de vie qu'ils ont. 
	protected int PosX;
	protected int PosY;
	protected double Vitesse;
	protected String Type;
	protected int Direction;
	protected int drop; // C'est l'or qu'ils vont fournir à chaque fois qu'ils mourront.  
	protected int HPLoose; // Le nombre de vies qu'ils font perdre au joueur à chaque fois qu'ils atteignent le point B.
	//protected boolean debuff; a mettre sur certain ennemy ( faibles/moyens)
	protected boolean isUnderBuff;
	
	public Ennemy(double hP, int posX, int posY, double vitesse, String type, int direction, int drop, int hPLoose) {
		HP = hP;
		PosX = posX;
		PosY = posY;
		Vitesse = vitesse;
		Type = type;
		Direction = direction;
		this.drop = drop;
		HPLoose = hPLoose;
	}


	public double getHP() {
		return HP;
	}


	public void setHP(double hP) {
		HP = hP;
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


	public double getVitesse() {
		return Vitesse;
	}


	public void setVitesse(double vitesse) {
		Vitesse = vitesse;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getDirection() {
		return Direction;
	}


	public void setDirection(int direction) {
		Direction = direction;
	}


	public int getDrop() {
		return drop;
	}


	public void setDrop(int drop) {
		this.drop = drop;
	}


	public int getHPLoose() {
		return HPLoose;
	}


	public void setHPLoose(int hPLoose) {
		HPLoose = hPLoose;
	}

	public boolean Malus() { // La vitesse des ennemies peut augmenter pendant un certain temps tout les 8 ennemis tuées.
		if(Math.random()<0.15) {
			return true;
		}
		return false;
	}
	
	//public void setUnderBuff(Boolean cond) 
	
	
}
