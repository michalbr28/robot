/**
 * 
 * @author Michal B
 *
 */
public class Robot {

	private String color;
	private int place;
	private boolean isInGame;

	public Robot(String color, int place, boolean isInGame) {
		this.color = color;
		this.place = place;
		this.isInGame = isInGame;

	}

	public String getColor() {
		return this.color;
	}

	public int getPlace() {
		return this.place;
	}

	public boolean isInGame() {
		return this.isInGame;
	}

	public void setC(String color) {
		this.color = color;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public void setInGame(boolean isInGame) {
		this.isInGame = isInGame;
	}

	public void next() {
		if (place < 100) {
			place++;
		} else {
			isInGame = false;
		}
	}

	public void back() {
		if (place > 1) {
			place--;
		} else {
			isInGame = false;
		}
	}

	public void nextN(int n) {
		place = place + n;
		if (place > 100) {
			isInGame = false;
		}
	}

	public void backN(int n) {
		place = place - n;
		if (place < 1) {
			isInGame = false;
		}
	}

	public void printPlace() {
		System.out.println("Place " + place);
	}

	@Override
	public String toString() {
		return "Robot [Color=" + color + ", place=" + place + ", isInGame=" + isInGame + "]";
	}
}
