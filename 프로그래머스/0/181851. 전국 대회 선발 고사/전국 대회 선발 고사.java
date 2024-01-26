import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        HashMap<Integer, Integer> rankPositionMap = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
                rankPositionMap.put(rank[i], i);
        }
        
        List<Integer> collect = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i])
                collect.add(rank[i]);
        }
        
        Collections.sort(collect);
        
        int firstPrize = rankPositionMap.getOrDefault(collect.get(0),0);
        int secondPrize = rankPositionMap.getOrDefault(collect.get(1),0);
        int thirdPrize = rankPositionMap.getOrDefault(collect.get(2),0);

        return firstPrize*10000 + secondPrize*100 + thirdPrize;
    }
}