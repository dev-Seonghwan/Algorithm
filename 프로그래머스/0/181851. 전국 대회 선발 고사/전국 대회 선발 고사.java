import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        HashMap<Integer, Integer> rankPositionMap = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i])
                rankPositionMap.put(rank[i], i);
        }

        List<Integer> collect = rankPositionMap.values().stream().limit(3).collect(Collectors.toList());

        int firstPrize = collect.get(0);
        int secondPrize = collect.get(1);
        int thirdPrize = collect.get(2);

        return firstPrize*10000 + secondPrize*100 + thirdPrize;        
    }
}