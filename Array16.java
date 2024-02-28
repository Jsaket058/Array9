import java.util.*;
import java.io.*;

class Array16{
	int[] union(int arr1[],int arr2[]){
		Set<Integer> st=new HashSet<>();
		for(int i:arr1){
			st.add(i);
		}
		for(int i:arr2){
			st.add(i);
		}
		Integer a[]=st.toArray(new Integer[0]);
		Arrays.sort(a);
		int x[]=new int[a.length];
		int j=0;
		for(int i:a){
			x[j++]=i;
		}
		return x;
	}
}

class Run{
	public static void main(String[] args){
		Array16 a=new Array16();
		int arr1[]={1,4,5,7,9,17,20};
		int arr2[]={2,5,6,8,9,14,17};
		int x[]=a.union(arr1,arr2);
		for(int i:x){
			System.out.println(i);
		}
	}
}