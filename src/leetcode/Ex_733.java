package leetcode;

public class Ex_733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        boolean[][] visited = new boolean[image.length][image[0].length];

        print(image);

        explore(visited, image, sr, sc, image[sr][sc], newColor);

        print(image);

        return null;
    }


    public static void explore(boolean[][] visited, int[][] image, int r, int c, int targetColor, int newColor) {

        visited[r][c] = true;

        int max_c = image[0].length-1;
        int max_r = image.length-1;
        image[r][c] = newColor;

        if(r>0) {
            if(image[r-1][c] == targetColor && !visited[r-1][c]){
                explore(visited, image, r-1, c, targetColor, newColor);
            }
        }
        if(c>0) {
            if(image[r][c-1] == targetColor && !visited[r][c-1]) {
                explore(visited, image, r, c-1, targetColor, newColor);
            }
        }

        if(r<max_r) {
            if(image[r+1][c] == targetColor && !visited[r+1][c]) {
                explore(visited, image, r+1, c, targetColor, newColor);
            }
        }

        if(c<max_c) {
            if(image[r][c+1] == targetColor && !visited[r][c+1]) {
                explore(visited, image, r, c+1, targetColor, newColor);
            }
        }

    }


    public static void print(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
