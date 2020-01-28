package chap14;

class Car{ //�⺻ ���� �ڵ���
	int gasolineGauge;  //���ָ� �ܿ���
	
	public Car(int gasolineGauge){
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car{  //���̺긮�� �ڵ���
	int electricGauge;  //���� ���͸� �ܿ���
	
	public HybridCar(int gasolineGauge, int electricGauge){
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge){
		super(gasolineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: " + electricGauge);
		System.out.println("�ܿ� ���ͷ�: " + waterGauge);
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridWaterCar hwc = new HybridWaterCar(100, 200, 300);
		hwc.showCurrentGauge();
		System.out.println();
		HybridWaterCar hwc2 = new HybridWaterCar(90, 90, 90);
		hwc2.showCurrentGauge();
	}

}