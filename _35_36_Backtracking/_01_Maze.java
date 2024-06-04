package DsaProgress._35_36_Backtracking;

import java.util.ArrayList;

//                              WE CAN ONLY GO DOWN (D) AND RIGHT (R)


public class _01_Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(pathRet("", 3, 3));
//        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("",0, 0, maze);
    }
    // total number of ways we can from (3, 3) to (1, 1)
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }
    // total paths
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r-1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }
    // add all paths in arraylist
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathRet(p + 'D', r-1, c));
        }
        if (c > 1) {
            ans.addAll(pathRet(p + 'R', r, c-1));
        }
        return ans;
    }
    // now we can also travel diagonal wise
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1 && c > 1){
            ans.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }
        if (r > 1) {
            ans.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if (c > 1) {
            ans.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }
        return ans;
    }
    // now we go (0, 0) to (2, 2) with (1, 1) path as restriction
    static void pathRestriction(String p, int r, int c, boolean[][] maze){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if (r < maze.length-1) {
            pathRestriction(p + 'D', r+1, c, maze);
        }
        if (c < maze[0].length-1) {
            pathRestriction(p + 'R', r, c + 1, maze);
        }
    }
}
