package it.unical.mat.ProvaIngSw_203788;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FunnyAlgorithms fa = new FunnyAlgorithms();
        
        System.out.println(fa.stringToIntConverter("123"));
        
        int[] array = {8,5,1,2,4,6};
        int target = 6;
        
        System.out.println(fa.binarySearch(array, target));
        
		int[] array2 = {5,2,3,9,6};
		int order = 1;
		
		fa.selectionSort(array2, order);
		for(int e : array2) {
			System.out.println(e);
		}
		
		
    }
}
