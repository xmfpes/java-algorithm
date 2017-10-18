import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {

	private Prime prime;
	@Before
	public void init() {
		prime = new Prime(1000);
	}

	@Test
	public void allPrimePrintTest() {
		//prime.printAllPrime();
	}
	
	@Test
	public void solveTest() {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int count = 0;
		for(int i=0; i<loop; i++) {
			if(!prime.isPrime(sc.nextInt())){
				count++;
			}
		}
		System.out.println(count);
	}
	
}
