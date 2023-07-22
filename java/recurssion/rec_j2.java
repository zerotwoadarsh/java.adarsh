import java.util.ArrayList;

public class rec_j2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = { 1, 2, 3, 56, 343, 4, 676, 4, 7, 4, 87, 4, 5, 6, 7 };
        // System.out.println(searchIndex(arr, 4, 0));
        // System.out.println(searchIndexLast(arr, 4, arr.length-1));
        
        System.out.print(searchAllIndex(arr, 4, 0, list));
    }
    
    // check for the array being sorted or not
    static boolean sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    // searching a perticular element
    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;
        return arr[index] == target || search(arr, target, ++index);
    }

    // returning the index of dersired element
    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        else
            return searchIndex(arr, target, ++index);
    }

    // returning the index of dersired element
    static int searchIndexLast(int[] arr, int target, int index) {
        if (index == -1)
            return -1;
        if (arr[index] == target)
            return index;
        else
            return searchIndexLast(arr, target, --index);
    }

     // returning all the indices of dersired element through arraylist
    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);

        return searchAllIndex(arr, target, ++index, list);
    }

    
    // another method for getting all the indices

    // // returning all the indices of dersired element through arraylist
    // static ArrayList<Integer> list = new ArrayList<Integer>();
    // static void searchAllIndex(int[] arr, int target, int index) {
    //     if (index == arr.length)
    //         return;
    //     if (arr[index] == target)
    //         list.add(index);

    //     searchAllIndex(arr, target, ++index);
    // }
    
    // // paste in main like:
    
    // searchAllIndex(arr, target, ++index);
    // System.out.println(list);



    // // arraylist when created in the function itself
    // static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index) {
    // ArrayList<Integer> list = new ArrayList<Integer>(null);
    //     if (index == arr.length)
    //         return list;
    //     if (arr[index] == target)
    //         list.add(index);

    // ArrayList<Integer> indexFromBelowCalls = searchAllIndex(arr, target, ++index);
    //   list.addAll(indexFromBelowCalls);
    //     return list;
    // }
}
