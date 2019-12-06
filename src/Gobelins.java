
public class Gobelins extends Ennemy {
	
	protected final int drop = 5;// C'est l'or qu'ils vont fournir à chaque fois qu'ils mourront.  
	protected final int HPLoose = 1;// Le nombre de vies qu'ils font perdre au joueur à chaque fois qu'ils atteignent le point B.
	//protected boolean debuff; a mettre sur certain ennemy ( faibles/moyens)
	
	public Gobelins(int[][] tab1,double Hp,int x,int y,String nom,boolean b,double speed) {
		HP=Hp;
		PosX=tab[0][0]; // 1 Case du tableau 
		PosY=tab[0][0]; // 1 Case du tableau , on va toujours commencer les maps par la premiere case.
		Nom=nom;
		isUnderBuffer=false;
		enVie=true;
		vitesse=speed;
		tab=tab1;
	}
	
	
	
	
	///GETTER AND SETTER
	
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

	public String getNom() {
		return Nom;
	}
	
	public int getDrop() {
		return drop;
	}

	public int getHPLoose() {
		return HPLoose;
	}
	public void setIsUnderBuffer(boolean b) {
		isUnderBuffer=b;
	}
	public boolean getIsUnderBuffer() {
			return isUnderBuffer;
	}
	public direction getDirection() {
			return dir;
	}
	
}
