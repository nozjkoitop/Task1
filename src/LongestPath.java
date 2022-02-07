public class LongestPath {
    public int[][] arrayOfPaths(int[][]array){
        int result[][] = new int[array.length][array.length];
        for (int i =0;i<array.length;i++){
            result[i][0]=array[i][0];
        }
        for (int z =1;z<array.length;z++){
            for (int x = 0; x < array.length; x++) {
                int tmp = 0;
                for (int y = x - 1; y <= x + 1 && y < array.length; y++) {
                    if (y < 0) {
                        y++;
                    }
                    if (result[y][z-1] > tmp) {
                        tmp = result[y][z-1];
                    }
                }
                result[x][z] = tmp + array[x][z];
            }
        }
        return result;
    }
    public static void report(int[][]array){
    for (int i =0;i<array.length;i++){
        for (int j=0;j<array.length;j++){
            System.out.println("The longest path to ["+j+"]["+i+"]->"+array[j][i]);
        }

    }
    }
}
