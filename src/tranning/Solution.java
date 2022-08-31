package tranning;

import java.util.*;

public class Solution {
    public long solution(int n, int[] lost, int[] reserve) {
        int not = 0;
        Map<Integer, Integer> studentsAndTrainning = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int e : reserve) {
            list.add(e);
        }

        for(int i=1;i<=n;i++){
            studentsAndTrainning.put(i,1);
        }
        Arrays.sort(lost);
        for(int e : lost){
            studentsAndTrainning.replace(e, 0);
        }
        Arrays.sort(reserve);
        for(int e: reserve){
            if(studentsAndTrainning.get(e)==0){
                studentsAndTrainning.replace(e,1);
                list.remove(Integer.valueOf(e));
            }

        }
        Collections.sort(list);

        for (int e : list) {
            if (e-1>=1 &&studentsAndTrainning.get(e - 1) == 0) {
                studentsAndTrainning.replace(e - 1, 1);
            } else if (e+1<=n &&studentsAndTrainning.get(e + 1) == 0) {
                studentsAndTrainning.replace(e + 1, 1);
            }
        }

        for(int i=1;i<=n;i++){
            if(studentsAndTrainning.get(i)==0){
                not+=1;
            }
        }

        return n-not;



    }
}
