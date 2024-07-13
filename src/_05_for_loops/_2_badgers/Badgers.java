package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		
		for (int y = 0; y < 2; y++) {
	
			for (int x = 0; x < 12; x++) {

				System.out.print("Badger");

				if (x < 11) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for (int x = 0; x < 2; x++) {

				System.out.print("Mushroom");
				
				if (x < 1) {
					System.out.print(", ");
					
					
				}
			}
			
			System.out.println();
			System.out.println();
			
		}
		System.out.print("A Snake!!!");
		
		
	}
}
