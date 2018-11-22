
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Direction dir = Direction.UP;
        System.out.println(dir);            // UP

        System.out.println(Direction.DOWN); // DOWN
        dir.action();
        Direction.DOWN.action();
	}

	
    public enum Direction {
        // enum 상수는 가장 윗줄에 선언되어야 하고 세미콜른(;)으로 마침
        // enum 상수 우측 괄호 안에 입력된 데이터는 생성자로 전달됨
        UP(0), DOWN(1), LEFT(2), RIGHT(3);// enum 상수들은 static 이며 현재 클래스 인스턴스 참조를 저장함
         
        private int num;  // 필요한 속성 선언
         
        // 생성자(default, private 둘 중 하나), 명시적 호출 불가
        Direction(int num){ 
            this.num = num;
        }
         
        // 임의의 메소드
        void action() {
            switch(num){
                case 0: System.out.printf("%s 방향이동%n", UP); break;
                case 1: System.out.printf("%s 방향이동%n", DOWN); break;
                case 2: System.out.printf("%s 방향이동%n", LEFT); break;
                case 3: System.out.printf("%s 방향이동%n", RIGHT); break;
            }
        }
    }	
}



