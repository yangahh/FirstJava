package chap14;

class Car{ //기본 연료 자동차
	int gasolineGauge;  //가솔린 잔여량
	
	public Car(int gasolineGauge){
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car{  //하이브리드 자동차
	int electricGauge;  //전기 배터리 잔여량
	
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
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
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