package MathConceptProblems;

import java.util.*;

//149. Max Points on a Line
//https://leetcode.com/problems/max-points-on-a-line/description/

public class MaxPointsonaLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1) {
            return 1;
        }
        int result = 2;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> cnt = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    cnt.merge(Math.atan2(points[j][1] - points[i][1],
                    	points[j][0] - points[i][0]), 1, Integer::sum);
                }
            }
            result = Math.max(result, Collections.max(cnt.values()) + 1);
        }
        return result;
    }

}
