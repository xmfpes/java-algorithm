import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> sevenList = new ArrayList<Integer>();
		for(int i=0; i<9; i++)
			sevenList.add(sc.nextInt());
		sevenList.stream().sorted().filter(people -> !sevenList.stream().filter(second -> people != second)
				.anyMatch(second -> people + second == sevenList.stream().mapToInt(Integer::intValue).sum() - 100)).forEach(System.out::println);
	}

}
