import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kyu7_scoring_tests {
    public static int sol(int[] arr, int r, int o, int w){
        return Arrays.stream(arr).map(v->v==0?r:v==1?o:-w).sum();
    }

    public static void main(String[] args) {
        int[][] base = new int[][]{
                new int[]{0, 0, 0, 0, 2, 1, 0},
                new int[]{0, 1, 0, 0, 2, 1, 0, 2, 2, 1},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 2, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 0},
                new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 0, 2, 1, 2, 0, 2, 1},
                new int[]{0, 2, 0, 2, 0, 2, 0, 2},
                new int[]{0, 1, 2, 0, 0, 2, 0, 1, 2, 1, 0, 0, 1, 0, 2, 1, 0, 2, 2, 0}
        };
        int[] result = new int[]{9, 3, 70, 90, -60, 20, 84};
        int[][] ele = new int[][]{
                new int[]{2,0,1},
                new int[]{3,-1,2},
                new int[]{5,-1,2},
                new int[]{6,0,1},
                new int[]{10,-5,10},
                new int[]{10,0,5},
                new int[]{9,3,2}
        };
        for(int i = 0; i < 7; i++) {
            String wsad = "For input [" + Arrays.stream(base[i]).mapToObj(x -> "" + x).collect(Collectors.joining(", ")) + "]";
            assertEquals(result[i], sol(base[i], ele[i][0], ele[i][1], ele[i][2]), String.format("%s r=%d o=%d w=%d", wsad, ele[i][0], ele[i][1], ele[i][2]));
        }

    }
}
