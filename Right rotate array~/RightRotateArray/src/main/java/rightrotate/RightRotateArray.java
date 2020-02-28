
package rightrotate;

/**
 *
 * @author Dinesh Nanda
 */

public class RightRotateArray {

    public static void main(String[] args) {
        
        int arr[] = {7, 9, 1, 4, 6, 10, 3};
        
        int new_arr[];
        
        new_arr =  new int[arr.length];
        
        new_arr[0] = arr[arr.length-1];
        
        for(int i = 0; i < arr.length - 1; i++){
            
            new_arr[i+1] = arr[i];
        }
        
        System.out.println("Right rotated array");
        
        for(int i = 0; i < new_arr.length; i++){
            
            System.out.print(new_arr[i] +" ");
        }
    }
    
}
