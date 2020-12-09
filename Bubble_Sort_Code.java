
public class BubbleSort {
	public static void main(String [] args) {
		
		int[] arr= {55,12,19,66,2,1};
		
		for (int out=0; out<arr.length; out++) {
			int x=out;
			for (int in=0; in<arr.length; in++) {
				if(arr[x]>arr[in]) {
					//swap(in, in+1);
					x=in;
				}
				int t=arr[in];
				arr[in]=arr[x];
				arr[x]=t;
			}
			
			
			
		}
		for (int a:arr) {
			System.out.println(a);
			
		}
		}
		
		
	



}
