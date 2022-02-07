public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,5},{3,5,6,5},{7,8,8,5},{1,2,3,9}};
        LongestPath longestPath = new LongestPath();
        LongestPath.report(longestPath.arrayOfPaths(a));
    }
}
