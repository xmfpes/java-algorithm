import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
	private Boolean[] sieveofEratosthenes;
	public List<Integer> primeList;
	public int n;
	
	public Prime(int n) {
		this.n = n;
		sieveofEratosthenes = new Boolean[n];
		//boolean Array를 false로 전부 채워준다.
		Arrays.fill(sieveofEratosthenes, false);
		primeList = new ArrayList<Integer>();
		sieveofEratosthenes(n);
	}

	//소수 판별 메소드 true는 소수가 아님, false는 소수
	public boolean isPrime(int i) {
		return sieveofEratosthenes[i];
	}
	//에라토스테네스의 체 구
	public void sieveofEratosthenes(int n) {
		//0과 1은 소수가 아닙니다.
		for(int i=0; i<2; i++) {
			sieveofEratosthenes[i] = true;
		}
		//2부터 소수 판별 시작
		for(int i=2; i<n; i++) {
			sieveofEratosthenesCheckPrime(i);
		}
	}
	
	//인덴트를 줄이기 위해 메소드 분리
	public void sieveofEratosthenesCheckPrime(int i) {
		if(!isPrime(i)) {
			primeList.add(i);
			sieveofEratosthenesInLoop(i);
		}
	}
	
	//인덴트를 줄이기 위해 메소드 분리
	public void sieveofEratosthenesInLoop(int i) {
		for(int j=i*2; j<n; j+=i) {
			sieveofEratosthenes[j] = true;
		}
	}
	
	//모든 소수 출력해보기
	public void printAllPrime() {
		this.primeList.stream().forEach(p -> System.out.println(p));
	}

}
