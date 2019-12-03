import java.util.ArrayList;

public abstract class Map {
	protected int Taille_X;
	protected int Taille_Y;
	protected int [][] tab;
	protected ArrayList<Tourelle> tourelle;
	protected ArrayList<Ennemy> ennemy;
	protected Menu[][] menu;
	
	public Map(int taille_x,int taille_y) {
			Taille_X=taille_x;
			Taille_Y=taille_y;
			tab= new int[taille_x][taille_y];
			menu= new Menu[5][15];
			ennemy= new ArrayList<Ennemy>();
			tourelle= new ArrayList<Tourelle>();
	}
	
	
	public void BougerEnnemy() {
		for(int i=0;i<ennemy.size();i++) {
				Ennemy E=ennemy.get(i);
				if( E.getIsUnderBuffer() == true ) { // Si ennemy 
					continue;
				}else {
					if(tab[E.getPosX()+1][E.getPosY()]==1) {
						E.moveX(1);
					}
					if(tab[E.getPosX()-1][E.getPosY()]==1) {
						E.moveX(-1);
					}
					if(tab[E.getPosX()][E.getPosY()+1]==1) {
						E.moveY(1);
					}
					if(tab[E.getPosX()][E.getPosY()-1]==1) {
						E.moveY(-1);
					}
				}
		}
	}
	
}
