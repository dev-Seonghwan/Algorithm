import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
 public int solution(int[] array) {
     
        int max= 0;
     
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> modeList = new ArrayList<>();
     
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > max){
                max = map.get(key);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == max ){
                modeList.add(key);
            }
        }

        if (modeList.size() > 1) {
            return -1;
        }
     
        return modeList.get(0);
    }
}