package Arrays.RotationAndArrangementReArrangement;
import java.util.*;

public class reorderarraytoindex {
            void reorder(int arr[], int ind[]){
            int temp[] = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            for(int i=0;i<arr.length; i++){
                arr[i]=temp[ind[i]];
                ind[i]=i;
            }
        }
        public static void main(String[] args) {
            int arr[] = {11,12,13};
            int ind[] = {2,0,1};
            reorderarraytoindex obj = new reorderarraytoindex();
            
            System.out.println("The Original Array was "+Arrays.toString(arr));
            
            obj.reorder(arr,ind);

            System.out.println("The Reordered Array is "+Arrays.toString(arr));
            
            System.out.println("The Reordered Index Array is "+Arrays.toString(ind));

    
        }
    }
