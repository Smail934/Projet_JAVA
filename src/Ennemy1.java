
public class Ennemy1 extends Ennemy {
	
	protected final int drop = 5;// C'est l'or qu'ils vont fournir à chaque fois qu'ils mourront.  
	protected final int HPLoose = 1;// Le nombre de vies qu'ils font perdre au joueur à chaque fois qu'ils atteignent le point B.
	//protected boolean debuff; a mettre sur certain ennemy ( faibles/moyens)
	
	public Ennemy1(double Hp,int x,int y,String nom,int dir,boolean b) {
		HP=Hp;
		PosX=x;
		PosY=y;
		Nom=nom;
		Direction=dir;
		isUnderBuffer=b;
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

	public String getNom() {
		return Nom;
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

	public int getHPLoose() {
		return HPLoose;
	}
	public void setIsUnderBuffer(boolean b) {
		isUnderBuffer=b;
	}
	public boolean getIsUnderBuffer() {
			return isUnderBuffer;
	}
	
	
}
