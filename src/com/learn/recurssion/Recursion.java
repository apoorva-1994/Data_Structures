
public class Recursion {
	static int sum = 0;
	public static void recursion(int s) {
		if(s > 3){
			return;
		}
		
		System.out.print(s + " ");
		s++;
		recursion(s);
		System.out.println("hello " + s);
	} 
	
	public static void recursion2(int s) {
		if(s < 4){
			System.out.print(s + " ");
			s++;
			recursion2(s);
			System.out.println("hello " + s);
		}
		return;
		//System.out.println("hello " + s);
	} 
	public static void recursion3(int ar[], int i, int size) {
	
		if(i < size) {
			System.out.println(ar[i]);
			i++;
			recursion3(ar, i, size);
			System.out.println("hello" + i);
		}else {
			return;
		}
	}
	
	public static void recursion4(int s) {
		if(s != 0) {
			sum = sum + s; 
			s--;
			recursion4(s);
		}else {
			return;
		}
		
	}
	
	public static boolean checkNum(int arr[], int i , int s) {
		boolean isPresent = false;
		if(arr[i] == 17) {
			System.out.println("---- Print no ------"+i);
			isPresent = true;
			return isPresent;
		}
		i++;
		if(i < s) {
			isPresent = checkNum(arr,i,s);
		}
		return isPresent;
	}
	
	public static boolean checkNum2(int arr[], int i, int s) {
		if (i < s) {
			return arr[i] == 17 || checkNum2(arr, ++i, s);
		}
		return false;
	}
	
	public static int sumOfArray(int arr[],int i , int s) {
		if(i < s) {
			return arr[i] + sumOfArray(arr, ++i, s);
		}
		return 0;
	}
	
	public static boolean checkSumOfArray(int arr[], int i, int s, int sum) {
		if(i < s) {
			sum = sum + arr[i];
			System.out.println(sum);
			if(sum > 500) {
				return false;
			}	
			return checkSumOfArray(arr, ++i, s, sum);
		}
		return true;
	}
	
	public static long factorial(long a) {
		if(a <= 1) {
			return 1L;
		}
		return a * factorial(a - 1);
	}
	
	public static int max(int arr[], int len, int i, int maxNum) {
		if(i < len) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
			return max(arr, len, ++i, maxNum);
		}
		return maxNum;
	}
	
	public static void main(String[] args) {	
		
//		int s = 1;
		//recursion(s);
		//recursion2(s);
//		int ar[] = new int[50];
//		for(int i = 0 ; i < ar.length ; i++) {
//			ar[i] = i;
//		}
//		recursion3(ar,0,ar.length);
//		recursion4(10);
//		System.out.println((int)(Math.random() * 100));
//		System.out.println((int)(Math.random() * 100));
//		System.out.println((int)(Math.random() * 100));
//		int arr[] = new int[100];
//		for(int i = 0 ; i < 100 ; i++) {
//			arr[i] = (int)(Math.random() * 100);
//			System.out.println(arr[i]);
//		}
//		System.out.println("--------------");
//		System.out.println(100*0.9999999999);
		int arr[] = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			float d = (float)(Math.random()*25);
			int s = (int) Math.round(d);
			System.out.println(i + "->"+ s);
			arr[i] = s;
		}
		//System.out.println(checkNum(arr, 0, arr.length));
	//	System.out.println(checkNum2(arr, 0, arr.length));
	//	System.out.println(sumOfArray(arr, 0, arr.length));
	//	System.out.println(checkSumOfArray(arr, 0, arr.length, 0));
	//	System.out.println(factorial(20L));
		int maxNum = arr[0];
		System.out.println("maxnum is : "+ maxNum);
		System.out.println(max(arr, arr.length, 1, maxNum));
	
	}
}

