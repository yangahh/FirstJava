//package chap15;
//
//class Box{
//	public void simpleWrap() {
//		System.out.println("Simple Wrapping");
//	}
//}
//
//class PaperBox extends Box{
//	public void paperWrap() {
//		System.out.println("Paper Wrapping");
//	}
//}
//
//class GoldPaperBox extends PaperBox{
//	public void goldPaperWrap() {
//		System.out.println("Gold Wrapping");
//	}
//}
//
//public class Wrapping {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Box box1 = new Box();
//		PaperBox box2 = new PaperBox();
//		GoldPaperBox box3 = new GoldPaperBox();
//		
//		wrapBox(box1); //Box box = box1 
//		wrapBox(box2); //Box box = box2 >> PaperBox는 Box이다 >> 가능
//		wrapBox(box3); //Box box = box3 >> GoldPaperBox는 Box이다 >> 가능
//	}
//	
//	public static void wrapBox(Box box) {  // 위 클래스의 인스턴스를 대상으로 하는 메소드  // 
////		//box가 Box 인스턴스를 참조하면, simpleWrap 메소드 호출
////		if(box instanceof Box)  // Box box = new Box() 가능? 
////			box.simpleWrap();	
////		//box가 PaperBox 인스턴스를 참조하면, paperWrap 메소드 호출
////		else if (box instanceof PaperBox)  // PaperBox box = new Box() 가능?
////			((PaperBox)box).paperWrap(); // 형 변환 안하면 box는 Box를 참조하므로 형 변환을 해줘야 한다
////		//box가 GoldPaperBox 인스턴스를 참조하면, goldPaperWrap 메소드 호출
////		else // GoldPaperBox box = new Box() 가능?
////			((GoldPaperBox)box).goldPaperWrap();
//		
//		//이렇게 하면 출력 결과로 모두 Simple Wrapping이 나옴. (첫번째 조건에 모두 해당되기 때문)
//		
//		//box가 Box 인스턴스를 참조하면, simpleWrap 메소드 호출
//		if(box instanceof GoldPaperBox)           // GoldPaperBox box = new Box() 가능?
//			((GoldPaperBox)box).goldPaperWrap();  // 형 변환 안하면 box는 Box를 참조하므로 형 변환을 해줘야 한다
//		
//		//box가 PaperBox 인스턴스를 참조하면, paperWrap 메소드 호출
//		else if (box instanceof PaperBox)         // PaperBox box = new Box() 가능?
//			((PaperBox)box).paperWrap(); 
//		
//		//box가 GoldPaperBox 인스턴스를 참조하면, goldPaperWrap 메소드 호출
//		else                                      // Box box = new Box() 가능? 
//			box.simpleWrap();
//		
//	
//	}
//}
//
//
