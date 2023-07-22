package Zmisc;
class sadle {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                        { 4, 7, 0 },
                        { 6, 11, 5 } };
        int row, col, target1 = 0, target2 = 0, c=0;
        for (row = 0; row < 3; ++row) {
            target1 = arr[row][0];
            for (col = 0; col < 3; ++col) {
                if (target1 > arr[row][col]) {
                    target1 = arr[row][col];
                    c=col;
                }
                target2 =0;
                for(int i=0;i<3;++i){
                    if(arr[i][c]>target2);
                    target2=arr[i][c];
                }
                if ((target1 == target2)) {
                    System.out.print( " " + target1);
                    break;
                }
            }
        }
    }
}