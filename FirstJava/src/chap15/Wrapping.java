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
//		wrapBox(box2); //Box box = box2 >> PaperBox�� Box�̴� >> ����
//		wrapBox(box3); //Box box = box3 >> GoldPaperBox�� Box�̴� >> ����
//	}
//	
//	public static void wrapBox(Box box) {  // �� Ŭ������ �ν��Ͻ��� ������� �ϴ� �޼ҵ�  // 
////		//box�� Box �ν��Ͻ��� �����ϸ�, simpleWrap �޼ҵ� ȣ��
////		if(box instanceof Box)  // Box box = new Box() ����? 
////			box.simpleWrap();	
////		//box�� PaperBox �ν��Ͻ��� �����ϸ�, paperWrap �޼ҵ� ȣ��
////		else if (box instanceof PaperBox)  // PaperBox box = new Box() ����?
////			((PaperBox)box).paperWrap(); // �� ��ȯ ���ϸ� box�� Box�� �����ϹǷ� �� ��ȯ�� ����� �Ѵ�
////		//box�� GoldPaperBox �ν��Ͻ��� �����ϸ�, goldPaperWrap �޼ҵ� ȣ��
////		else // GoldPaperBox box = new Box() ����?
////			((GoldPaperBox)box).goldPaperWrap();
//		
//		//�̷��� �ϸ� ��� ����� ��� Simple Wrapping�� ����. (ù��° ���ǿ� ��� �ش�Ǳ� ����)
//		
//		//box�� Box �ν��Ͻ��� �����ϸ�, simpleWrap �޼ҵ� ȣ��
//		if(box instanceof GoldPaperBox)           // GoldPaperBox box = new Box() ����?
//			((GoldPaperBox)box).goldPaperWrap();  // �� ��ȯ ���ϸ� box�� Box�� �����ϹǷ� �� ��ȯ�� ����� �Ѵ�
//		
//		//box�� PaperBox �ν��Ͻ��� �����ϸ�, paperWrap �޼ҵ� ȣ��
//		else if (box instanceof PaperBox)         // PaperBox box = new Box() ����?
//			((PaperBox)box).paperWrap(); 
//		
//		//box�� GoldPaperBox �ν��Ͻ��� �����ϸ�, goldPaperWrap �޼ҵ� ȣ��
//		else                                      // Box box = new Box() ����? 
//			box.simpleWrap();
//		
//	
//	}
//}
//
//
