import java.util.ArrayList;

public class rec_j5_mazes{
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("", 3, 3);
        // System.out.println(pathList("",3,3));
        System.out.println(pathDiagonalList("",3,3));
    }

    // counting the number of paths for crossing the maze
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }
    
    // printing all the possible paths for crossing the maze
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+"D", r-1, c);
        }

        if (c>1){
            path(p+"R", r, c-1);
        }
        return;
    }
    
    // printing all the possible paths for crossing the maze and returning through the arraylist
    static ArrayList<String> pathList(String p, int r, int c){
        ArrayList<String> list = new ArrayList<String>();
        if(r == 1 && c == 1){
            list.add(p);
            return list;
        }
        if (r>1){
            list.addAll(pathList(p+"D", r-1, c));
        }
        
        if (c>1){
            list.addAll(pathList(p+"R", r, c-1));
        }
        return list;
    }
    
    // printing all the possible paths including diagonal for crossing the maze and returning through the arraylist
    static ArrayList<String> pathDiagonalList(String p, int r, int c){
        ArrayList<String> list = new ArrayList<String>();
        if(r == 1 && c == 1){
            list.add(p);
            return list;
        }
        if (r > 1){
            list.addAll(pathDiagonalList(p+"D", r-1, c));
        }

        if (c > 1){
            list.addAll(pathDiagonalList(p+"R", r, c-1));
        }

        if (r > 1 && c > 1){
            list.addAll(pathDiagonalList(p+"Di", r-1, c-1));
        }
        return list;
    }
    
    // printing all the possible paths including restrictions 
    static void pathRestriction(String p, Boolean [][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (r < maze.length-1){
            pathRestriction(p+"D", maze, r-1, c);
        }
    
        if (c < maze[0].length-1){
            pathRestriction(p+"R", maze, r, c-1);
        }
        return;
    }
}