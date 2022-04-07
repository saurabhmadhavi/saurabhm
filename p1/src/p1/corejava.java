package p1;

public class corejava {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// is used to store similar type of element [1,2,3,4,5]
		
		// single dimension array , multidimension array (double )
		
		int array[] = new int[5]; // declarion
		int[] ar = new int[5];   // 2nd   
		
	
		
		int arr[] = {1,2,3,4,8,9,1};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		
		String str[] = new String[5];  
		
		char ch[] = new char[5];
		
		double doub[] = new double[5]; 
		
		float flo[] = new float[5];
		
		byte b[] = new byte[5]; 
		
		for ( int i = 0; i < str.length; i++) {
			str[i] = "Ajay";
		}
		
		
		
//		
//		array[0] = 10;
//		array[1] = 11;
//		array[2] = 12;
//		array[3] = 13;
//		array[4] = 14;
//		//array[5] = 15;
		
		//System.out.println(array[4]);
		
		//for loop
		int i = 0;
		for ( i = 0; i < array.length; i++) {
			array[i] = 1;
		}
		
		
		for ( i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		int doublearr[][] = new int[3][2];  //declasre
		
		int[][] doublearray = new int[3][2];  //declasre
		
		int[][] doublearrs = { {1,2}, {2,3} }; // declsre plus initislization
		
		for (int row = 0; row < doublearrs.length; row++) {
			for (int col = 0; col < doublearrs[row].length; col++) {
				doublearr[row][col] = 1;
			}
		}
		
		}
	
}