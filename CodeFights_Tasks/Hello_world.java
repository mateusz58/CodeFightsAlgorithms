
public class Main{

 public static int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    return statues[statues.length-1]-statues[0]-statues.length+1;
}
 public static void main(String []args) {   
     int arr1[]={1,2,3,4,5,6,7,8,9}; 
     
     System.out.println(makeArrayConsecutive2(arr1));
   }
}