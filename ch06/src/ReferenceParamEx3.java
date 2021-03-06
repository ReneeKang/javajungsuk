
public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[]arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr); // 배열의 모든 요소를 출
		sortArr(arr); // 배열을 정
		printArr(arr); // 정렬 후 결과를 출력 
		System.out.println("sum="+ sumArr(arr) ); // 배열의 총합을 출력 
	}
	
	static void printArr(int[] arr) {
		for(int i : arr) System.out.print(i+",");
		System.out.println();
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
//		System.out.println("sum = "+sum);
		return sum;
	}
	
}
