package generic;

//Object타입을 이용한 클래스

public class Ex2 {
	public static void main(String[] args) {
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		Powder p1 = new Powder(); //Powder를 재료로 선택
		
		printer.setMaterial(p1);
		//Object Powder = new Powder(); // 위의 코드와 같음, 부모타입 변수 = 자식 인스턴스 (성립가능, 자동형변환)
		
		//자식 타입 변수에 부모 타입은 담기지 않고 다운캐스팅을 해줘야 함.
		Powder p2 = (Powder)printer.getMaterial();
		p2.doPrinting();
		
	}
}


//파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter3{
	
	private Object material;//자료형을 Object로 선언하면 파우더와 플라스틱 모두 저장할 수 있음
	
	public void setMaterial(Object material) {//Object형 매개변수
		this.material = material;
	}
	
	public Object getMaterial() {//Object형 리턴타입
		return material;
	}
}
