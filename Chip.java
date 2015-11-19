/* Chip.java */
public class Chip {
	public static final int BLACK = 0;
	public static final int WHITE = 1;
	public boolean used;
	protected int colour;
	protected int x;
	protected int y;

	public Chip(int colour, int xposition, int yposition) {
		this.colour = colour;
		x = xposition;
		y = yposition;
		used = false;
	}

	public int xPosition() {
		return x;
	}

	public int yPosition() {
		return y;
	}

	public int chipColour() {
		return colour;
	}

	public void isUsed(boolean change) {
		this.used = change;
	}
}