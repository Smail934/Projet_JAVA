

public abstract class Ennemy {
	
	public enum direction {LEFT, RIGHT, UP, DOWN};

	protected double HP; // Le nombre de point de vie qu'ils ont. 
	protected int PosX;
	protected int PosY;
	protected String Nom;
	protected boolean isUnderBuffer;
	protected boolean enVie;
	protected boolean visible;
	protected double vitesse;
	protected boolean pointFinal = false; // point d'arrivée
	protected int[][] tab;
	direction dir;
	
	public Ennemy() {}
	
	public abstract int getPosX();
	public abstract void setPosX(int posx);
	public abstract int getPosY();
	public abstract void setPosY(int posy);
	public abstract double getHP();
	public abstract void setHP(double hp);
	public abstract String getNom();
	public abstract int getDrop();
	public abstract int getHPLoose();
	public abstract boolean getIsUnderBuffer();
	public abstract void setIsUnderBuffer(boolean b);
	//public abstract double Vitesse();
	
	public void move() {
		//mettre une condition si l'ennemie est freeze ou non ( pour plus tard )
		
		while(tab[PosX][PosY]!=2) {
			continue;
		}
		if(tab[PosX+1][PosY]==1) {
			PosX=PosX + (int)this.getVitesse();
			dir=direction.RIGHT;
		}
		if(tab[PosX][PosY+1]==1) {
			PosY=PosY+(int)this.getVitesse();
			dir=direction.DOWN;
		}if(tab[PosX-1][PosY]==1) {
			PosX-=(int)this.getVitesse();
			dir=direction.LEFT;
		}if(tab[PosX][PosY-1]==1) {
			PosY-=(int)this.getVitesse();
			dir=direction.UP;
		}
		if(tab[PosX][PosY]==3) {
			visible=false;
			pointFinal=true;
		}	
		
	}
	
	
	
	/*public boolean Malus() { // La vitesse des ennemies peut augmenter pendant un certain temps tout les 8 ennemis tuÃ©es.
		if(Math.random()<0.15) {
			return true;
		}
		return false;
	}
	public static void wait(int tps) {
		try {Thread.sleep(1000 * tps);} catch (InterruptedException e) { Thread.currentThread().interrupt(); }
	}*/
	
	
	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public void DommageRecu(double dommage) {
		HP-=dommage;
		if(HP<=0) {
			enVie=false;
			visible=false;
		}
	}
	
	
}
