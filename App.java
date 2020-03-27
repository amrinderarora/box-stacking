package boxstacking;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
				
		Box[] input = new Box[25];
		for (int i = 0; i < input.length; i++) {
			Random r = new Random();
			int newH = r.nextInt((10-1)+1)+1;
			int newW = newH + r.nextInt((10-1)+1)+1;
			int newD = newW + r.nextInt((10-1)+1)+1;
			input[i] = new Box(newH, newW, newD);
			//System.out.printf("\n\t%d, %d, %d", newH, newW, newD);
		}
		
		Algorithm boxStacking = new Algorithm();
		
		System.out.println("\nMax height: "+ boxStacking.solve(input));

	}

}
