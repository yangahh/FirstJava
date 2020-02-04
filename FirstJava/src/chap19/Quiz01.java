package chap19;

class Point{
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	
}

class Rectangle { 
	private Point upperLeft;   // ÁÂÃø »ó´Ü ÁÂÇ¥
	private Point lowerRight;  // ¿ìÃø ÇÏ´Ü ÁÂÇ¥
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}

public class Quiz01 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(1, 1, 2, 2);
	}

}
