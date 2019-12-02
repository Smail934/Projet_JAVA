
public abstract class Tourelle {
	protected int PosX;
	protected int PosY;
	protected int Range;
	protected double Degats;
	protected String Type;
	
	public Tourelle(int posX, int posY, int range, double degats, String type) {
		super();
		PosX = posX;
		PosY = posY;
		Range = range;
		Degats = degats;
		Type = type;
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
