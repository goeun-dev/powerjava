package ch08.prgm;
// 3��
public class Dice {
	int face;

	public int roll() {
		face = (int) (Math.random() * 6) + 1;
		return face;
	}
}
