package Zmisc;
// import java.util.Arrays;
import java.util.ArrayList;

public class array {
   public static void main(String[] args) {
     
      int arr[] = { 0, 1, 2, 3, 4, 4, 4, 4, 4, 9 };
      int target = 4, index = 0;
      findAllIndexList(arr, target, index,list);
      System.out.println(list);

   }

   // if element is present or not
   static boolean find(int arr[], int target, int index) {
      if (index == arr.length)
         return false;
      if (arr[index] == target)
         return true;
      else
         return find(arr, target, index + 1);
   }

   // get the index if element is present
   static int findIndex(int arr[], int target, int index) {
      if (index == arr.length)
         return -1;
      if (arr[index] == target)
         return index;
      else
         return findIndex(arr, target, index + 1);
   }

   // get all the index of the target element
   static ArrayList<Integer> list = new ArrayList<>();
   static void findAllIndex(int arr[], int target, int index) {
      if (index==arr.length)
      return;
      if (arr[index] == target)
         list.add(index);
      findAllIndex(arr, target, index + 1);
   }

   static ArrayList<Integer> findAllIndexList(int arr[], int target, int index, ArrayList<Integer> list) {
      if (index==arr.length)
      return list;
      if (arr[index] == target){
         list.add(index);
      }
     return findAllIndexList(arr, target, index + 1, list);
   }
}