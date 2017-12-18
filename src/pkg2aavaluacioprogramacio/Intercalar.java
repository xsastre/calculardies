
public class Intercalar {
    public static void main(String[] args){
    	int arr1[] = {1,3,5,7,9,11,13,15};
    	int arr2[] = {2,4,6,8,10,12,14,16};
    	int arr3[] = Intercalar(arr1, arr2);
    	for(int i = 0; i < Intercalar(arr1, arr2).length; i++)
    		System.out.println(Intercalar(arr1, arr2)[i]);
    }
    public static int[] Intercalar(int arr1[], int arr2[]){
    	int arr3[] = new int[arr1.length+arr2.length];
    	int j = 0, k = 0;
    	for(int i = 0; i < arr3.length;){
    		if(j < arr1.length){
    			arr3[i] = arr1[j];
    			i++; j++;
    		}
    		if(k < arr2.length){
				arr3[i] = arr2[k];
				i++; k++;
    		}
    	}
    	return arr3;
    }
    
}
