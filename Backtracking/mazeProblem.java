package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class mazeProblem {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // path("", 3, 3);

        // System.out.println(pathReturn("", 3,3));

        // System.out.println(pathReturnDiagonal("", 3,3));

        // boolean[][] board = {
        //     {true,true,true},
        //     {true,true,true},
        //     {true,true,true}
        // };
        // // pathRestrictions("", board,0, 0);
        // allPath("", board,0, 0);


        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }
    static int count (int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            path(p + 'D', row - 1, col);
        }

        if(col > 1){
            path(p + 'R', row, col - 1);
        }
    }

    static ArrayList<String> pathReturn(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        if(row > 1){
            result.addAll(pathReturn(p + 'D', row - 1, col));
        }

        if(col > 1){
            result.addAll(pathReturn(p + 'R', row, col - 1));
        }

        return result;
    }

    static ArrayList<String> pathReturnDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();

        if(row> 1 && col >1){
            result.addAll(pathReturnDiagonal(p + 'D', row - 1, col - 1));
        }
        if(row > 1){
            result.addAll(pathReturnDiagonal(p + 'V', row - 1, col));
        }

        if(col > 1){
            result.addAll(pathReturnDiagonal(p + 'H', row, col - 1));
        }

        return result;
    }

    static void pathRestrictions(String p,boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length  - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row > 1){
            pathRestrictions(p + 'D', maze, row + 1, col);
        }

        if(col > 1){
            pathRestrictions(p + 'R', maze, row, col + 1);
        }
    }

    static void allPath(String p,boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //  I am considering this block in my path:
        maze[row][col] = false;

        if(row < maze.length - 1){
            allPath(p + 'D',maze, row + 1, col);
        }

        if(col < maze[0].length - 1){
            allPath(p + 'R',maze, row, col + 1);
        }

        if(row > 0){
            allPath(p + 'U', maze, row - 1, col);
        }
        if(col > 0){
            allPath(p + 'L', maze, row, col - 1);
        }

        // This line is where the function will be over
        // So before the function gets removed, also remove the changes that were made by the changes:
        maze[row][col] = true;
    }


    static void allPathPrint(String p,boolean[][] maze, int row, int col,int[][] path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //  I am considering this block in my path:
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1){
            allPathPrint(p + 'D',maze, row + 1, col, path, step + 1);
        }

        if(col < maze[0].length - 1){
            allPathPrint(p + 'R',maze, row, col + 1, path, step + 1);
        }

        if(row > 0){
            allPathPrint(p + 'U', maze, row - 1, col,  path, step + 1);
        }
        if(col > 0){
            allPathPrint(p + 'L', maze, row, col - 1,  path, step + 1);
        }

        // This line is where the function will be over
        // So before the function gets removed, also remove the changes that were made by the changes:
        maze[row][col] = true;
        path[row][col] = 0;
    }
}