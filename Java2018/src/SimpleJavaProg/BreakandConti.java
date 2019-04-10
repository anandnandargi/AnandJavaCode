package SimpleJavaProg;

public class BreakandConti {

	public static void main(String[] args) {
		
		System.out.println("Continue loop starts here...");
		for (int i = 0; i <= 5; i++) {
			if (i == 3)
				
				continue;
			System.out.println(i);
		}
		System.out.println("Continue loop ends here...");
		System.out.println("Break Loop starts");
		for (int j = 0; j < 5; j++) {
			if (j == 3)
				break;
			System.out.println(j);
		}
	}

}
