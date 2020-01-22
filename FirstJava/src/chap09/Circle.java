package chap09;

class Circle {
//	Point p = new Point(0, 0);
	Point center; //원의 중심
	int rad;
		
	public Circle(int x, int y, int r) {
//		p.xPos = x;
//		p.yPos = y;
		center = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
//		p.showPointInfo();
		center.showPointInfo();
		System.out.println("radius : " + rad);
	}
}
