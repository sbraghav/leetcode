class Solution {
    public static boolean exists(int [][] image, int r, int c){
        return (r >= 0 && c >= 0 && image.length > r && image[0].length > c);
    }
    public static void fillColor(int[][] image, int sr, int sc, int color, int startingColor){
        if(exists(image, sr, sc) && image[sr][sc] == startingColor && image[sr][sc] != color){
            image[sr][sc] = color;
            fill(image, sr, sc, color, startingColor);
        }
    }
    public static void fill(int[][] image, int sr, int sc, int color, int startingColor) {
        fillColor(image, sr - 1, sc, color, startingColor);
        fillColor(image, sr + 1, sc, color, startingColor);
        fillColor(image, sr, sc - 1, color, startingColor);
        fillColor(image, sr, sc + 1, color, startingColor);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startingColor = image[sr][sc];
        image[sr][sc] = color;
        fill(image, sr, sc, color, startingColor);
        return image;
    }
    public static void main(String args[]){
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image, 1, 1, 2);
    }
}