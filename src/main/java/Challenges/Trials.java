package Challenges;

import java.util.*;
import java.util.regex.Pattern;

class A{
    static int add(int i, int j){
        return i+j;
    }
}

class Sample implements Runnable{

    private Thread t;
    private String threadName;

    public Sample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(threadName);
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class Trials{

    //private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static Pattern pattern = Pattern.compile("[+-]?[0-9]+");
    public static void main(String[] args) {

        /*try {
            Integer.parseInt(words[i]);
            integer_count++;
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(words[i]);
                double_count++;
            } catch (NumberFormatException e2) {
                string_count++;
            }
        }*/
//        int i = 010;
//        int j = 07;
//        System.out.println(i);
//        System.out.println(j);

//        Sample A = new Sample("A");
//        Sample B = new Sample("B");
//
//        B.start();
//        A.start();
        //System.out.println(Integer.parseInt("602436426"));
//        String encryptedMessage = "seaside the to sent be to ne2ds army ten of team a";
//
//        StringBuilder message = new StringBuilder();
//
//        int size = encryptedMessage.length();
//
//        for (int i = size; i > 1; i--) {
//            message.append(encryptedMessage.charAt(i));
//        }
//
//        System.out.println(message.toString());//System.out.println(isNumeric("602436426.2"));
//        char[] arr = {'a', ' ', 'b'};
//        System.out.println(String.valueOf(arr).replace(" ", ""));

        int[][] mat = new int[][] {
                { 0, 0, 1, 0},
                { 1,0, 0, 0},
                { 0, 0, 1, 0}
        };

//        int dist = findShortestPathLength(mat, 3, 4);
//        if (dist != -1)
//            System.out.print("Shortest Path is " + dist);
//
//        else
//            System.out.print("Shortest Path doesn't exist");

//        int[] start = {0, 0};
//        int[] end = {3, 3};
//        int shortestDistance = shortestPath(mat, 3, 4, start, end);

          System.out.println("Shortest distance from: " + shortestPath(mat, 3, 4));
    }



    //================================================================================
    public static int shortestPath(int[][] maze, int numRows, int numCols) {
        int[][] distances = new int[numRows][numCols];
        boolean[][] visited = new boolean[numRows][numCols];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize the distances matrix with -1 (unreachable)
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (maze[i][j] == 1) {
                    distances[i][j] = 0;
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                } else {
                    distances[i][j] = -1;
                }
            }
        }

        // BFS to compute the distances from obstacles to all other points
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            // Visit the neighbor to the north of the current point
            if (row - 1 >= 0 && !visited[row - 1][col]) {
                distances[row - 1][col] = distances[row][col] + 1;
                visited[row - 1][col] = true;
                queue.offer(new int[]{row - 1, col});
            }

            // Visit the neighbor to the south of the current point
            if (row + 1 < numRows && !visited[row + 1][col]) {
                distances[row + 1][col] = distances[row][col] + 1;
                visited[row + 1][col] = true;
                queue.offer(new int[]{row + 1, col});
            }

            // Visit the neighbor to the west of the current point
            if (col - 1 >= 0 && !visited[row][col - 1]) {
                distances[row][col - 1] = distances[row][col] + 1;
                visited[row][col - 1] = true;
                queue.offer(new int[]{row, col - 1});
            }

            // Visit the neighbor to the east of the current point
            if (col + 1 < numCols && !visited[row][col + 1]) {
                distances[row][col + 1] = distances[row][col] + 1;
                visited[row][col + 1] = true;
                queue.offer(new int[]{row, col + 1});
            }
        }

        // Find the minimum distance in the distances matrix
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (distances[i][j] != -1 && distances[i][j] < minDistance) {
                    minDistance = distances[i][j];
                }
            }
        }

        return minDistance;
    }


    //================================================================================

    static boolean[][] visited;
    static boolean isSafe(int[][] mat, boolean[][] visited,
                          int x, int y) {
        return (x >= 0 && x < mat.length && y >= 0
                && y < mat[0].length && mat[x][y] == 1
                && !visited[x][y]);
    }

    static int findShortestPath(int[][] mat, int i, int j,
                                int x, int y, int min_dist,
                                int dist) {

        if (i == x && j == y) {
            min_dist = Math.min(dist, min_dist);
            return min_dist;
        }

        // set (i, j) cell as visited
        visited[i][j] = true;
        // go to the bottom cell
        if (isSafe(mat, visited, i + 1, j)) {
            min_dist = findShortestPath(mat, i + 1, j, x, y,
                    min_dist, dist + 1);
        }
        // go to the right cell
        if (isSafe(mat, visited, i, j + 1)) {
            min_dist = findShortestPath(mat, i, j + 1, x, y,
                    min_dist, dist + 1);
        }
        // go to the top cell
        if (isSafe(mat, visited, i - 1, j)) {
            min_dist = findShortestPath(mat, i - 1, j, x, y,
                    min_dist, dist + 1);
        }
        // go to the left cell
        if (isSafe(mat, visited, i, j - 1)) {
            min_dist = findShortestPath(mat, i, j - 1, x, y,
                    min_dist, dist + 1);
        }
        // backtrack: remove (i, j) from the visited matrix
        visited[i][j] = false;
        return min_dist;
    }

    // Wrapper over findShortestPath() function
    static int findShortestPathLength(int[][] mat, int row, int col) {
        if (mat.length == 0 || row == 0 || col == 0)
            return -1;

        // construct an `M × N` matrix to keep track of
        // visited cells
        visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                visited[i][j] = false;
        }

//        int dist = Integer.MAX_VALUE;
//        dist = findShortestPath(mat, src[0], src[1],
//                dest[0], dest[1], dist, 0);

//        if (dist != Integer.MAX_VALUE)
//            return dist;
        return -1;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
