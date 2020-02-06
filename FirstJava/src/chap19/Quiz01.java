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
//		Point p = (Point)obj;
//        
//      if(xPos == p.xPos && yPos == p.yPos)
		if((this.xPos == ((Point)obj).xPos) && (this.yPos == ((Point)obj).yPos)) // obj가 작은 그릇 >> 더 큰 그릇인 Point로 형변환 가능. obj.xPos >> obj형으로는 xPos에 접근 불가능. 그래서 Point로 강제형변환
			return true;
		else
			return false;
	}
	
}

class Rectangle { 
	private Point upperLeft;   // 좌측 상단 좌표
	private Point lowerRight;  // 우측 하단 좌표
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj ;
		
		if((this.upperLeft.equals(r.upperLeft)) && (this.lowerRight.equals(r.lowerRight)))  // Rectangle은 Point 클래스 2개로 초기화. equals를 안쓰고 ==를 쓰면 참조 대상을 비교. 아몰랑
			return true;
		else
			return false;
	}
	
}

public class Quiz01 {

	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		
		Rectangle r1 = new Rectangle(1, 1, 2, 2);
		Rectangle r2 = new Rectangle(1, 1, 2, 2);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 좌표가 같다.");
		else
			System.out.println("p1과 p2는 좌표가 다르다.");
		
		System.out.println();
		
		if(r1.equals(r2))
			System.out.println("r1과 r2는 좌표가 같다.");
		else
			System.out.println("r1과 r2는 좌표가 다르다.");	
	}

}

/*
 * 참고 사이트(생활코딩)
 * https://edu.goorm.io/learn/lecture/41/%EB%B0%94%EB%A1%9C%EC%8B%A4%EC%8A%B5-%EC%83%9D%ED%99%9C%EC%BD%94%EB%94%A9-%EC%9E%90%EB%B0%94-java/lesson/39244/equals 
 */
 