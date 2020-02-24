package chap28;

import java.util.function.ToIntBiFunction;

class IBox{
	private int n;
	public IBox(int i) {
		n = i;
	}
	public int larger(IBox b) {
		if(n > b.n)
			return n;
		else
			return b.n;
	}
}

public class NoObjectMethodRef {
	public static void main(String[] args) {
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		// 두 상자에 저장된 값 비교하여 더 큰 값 반환
//		ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);  // ToIntBiFunction<IBox, IBox> : 인자로 2개의 IBox형 인스턴스, 결과는 int로 반환
		ToIntBiFunction<IBox, IBox> bf = IBox::larger;
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}

}
// ToIntBiFunction<T, U> 함수형 인터페이스   int applyAsInt(T t, U u) 추상메소드