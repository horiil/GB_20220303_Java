package condition;
// witch문은 결과를 가지고 분기를 역추적할때 사용
public class Main06 {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch (grade) {
		case 'A':
			System.out.println("91 ~ 100점 사이 입니다.");
			break;
		case 'B':
			System.out.println("81 ~ 90점 사이 입니다.");
			break;
		case 'C':
			System.out.println("71 ~ 80점 사이 입니다.");
			break;
		default:
			System.out.println("70점 이하입니다.");
			break;
		}

	}

}
