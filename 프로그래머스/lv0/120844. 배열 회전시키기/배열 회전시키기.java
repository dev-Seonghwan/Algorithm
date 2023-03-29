import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        List<Integer> intList =
                Arrays.stream(numbers)
                        .boxed()
                        .collect(Collectors.toList());

        if (direction.equals("left")){
            intList.add(intList.get(0));
            intList.remove(0);
        }
        else {
            intList.add(0,intList.get(intList.size()-1));
            intList.remove(intList.size()-1);
        }
        int[] answer = intList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}