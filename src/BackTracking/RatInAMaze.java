package BackTracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {
//        findPath()
        int[][] arr = {
                { 1, 1, 1},
                { 1 ,1, 1},
                { 1 ,1, 1}
        };
        ArrayList<String> path = findPath(arr, 0, 0, "");
        System.out.println(path);

    }

    public static ArrayList<String> findPath(int[][] arr, int r, int c, String p) {
        ArrayList<String> list = new ArrayList<>();
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            list.add(p);
            return list;
        }

        if (arr[r][c] == 0) {
            return list;
        }
        arr[r][c] = 0;

        // Down
        if (r < arr.length - 1) {
            ArrayList<String> down = findPath(arr, r + 1, c, p + "D");
            list.addAll(down);
        }

        // Right
        if (c < arr[0].length - 1) {
            ArrayList<String> right = findPath(arr, r, c + 1, p + "R");
            list.addAll(right);
        }

        // Left
        if (c > 0) {
            ArrayList<String> left = findPath(arr, r, c - 1, p + "L");
            list.addAll(left);
        }

        // Up
        if (r > 0) {
            ArrayList<String> up = findPath(arr, r - 1, c, p + "U");
            list.addAll(up);
        }

        arr[r][c] = 1;
        return list;
    }


    public static void findPaths(int[][] arr, int r, int c, String p) {

        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (arr[r][c] == 0) {
            return;
        }
        arr[r][c] = 0;

//right
        if (c < arr[0].length - 1) {
            findPaths(arr, r, c + 1, p+"R");
        }

//down
        if (r < arr.length - 1) {
            findPaths(arr, r + 1, c, p+"D");

        }
//up
        if (r > 0) {
            findPaths(arr, r - 1, c, p+"U");

        }

//left
        if (c > 0) {
            findPaths(arr, r, c - 1, p+"L");

        }
        arr[r][c] = 1;

    }
}



