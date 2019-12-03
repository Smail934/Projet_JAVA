
import java.sql.Time;

public abstract class Ennemy {
	protected double HP; // Le nombre de point de vie qu'ils ont. 
	protected int PosX;
	protected int PosY;
	protected String Nom;
	protected int Direction;
	protected boolean isUnderBuffer;
	
	public Ennemy() {}
	
	public abstract int getPosX();
	public abstract void setPosX(int posx);
	public abstract int getPosY();
	public abstract void setPosY(int posy);
	public abstract double getHP();
	public abstract void setHP(double hp);
	public abstract String getNom();
	public abstract int getDirection();
	public abstract void setDirection(int d);
	public abstract int getDrop();
	public abstract int getHPLoose();
	public abstract boolean getIsUnderBuffer();
	public abstract void setIsUnderBuffer(boolean b);
	//public abstract double Vitesse();
	
	public void moveX(int x) {
		PosX+=x;
	}
	public void moveY(int y) {
		PosY+=y;
	}
	public boolean Malus() { // La vitesse des ennemies peut augmenter pendant un certain temps tout les 8 ennemis tuées.
		if(Math.random()<0.15) {
			return true;
		}
		return false;
	}
	public static void wait(int tps) {
		try {Thread.sleep(1000 * tps);} catch (InterruptedException e) { Thread.currentThread().interrupt(); }
	}
	
	
	//public void setUnderBuff(Boolean cond) 
	
	
}
