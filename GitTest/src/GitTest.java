
public class GitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello JAVA!");
		
		System.out.println("----------------------------");
		System.out.println("구구단");
		
		for(int i = 2; i < 10; i++) {
			System.out.printf("\n---%d 단--- \n", i);
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d \n", i, j, i*j);
			}
		}
	}

}
