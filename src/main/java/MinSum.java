import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinSum {
	public static int getMinSum(int []A, int []B)
    {
        int answer = 0;
        List<Integer> aList = Arrays.stream(A).boxed().collect(Collectors.toList());
        aList.sort((c1, c2) -> c1 - c2);
        
        List<Integer> bList = Arrays.stream(B).boxed().collect(Collectors.toList());
        bList.sort((c1, c2) -> c1 - c2);
        
        for(int i=0; i<aList.size(); i++) {
        		answer += (aList.get(i) * bList.get(bList.size() - 1 - i));
		}
        
        return answer;
    }
    public static void main(String[] args)
    {
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(getMinSum(A, B));
    }
}
