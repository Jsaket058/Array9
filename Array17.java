import java.util.*;
import java.io.*;

class Array17{
	int[] union(int arr1[],int arr2[]){
		ArrayList<Integer> Union=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length){
			if (arr1[i] <= arr2[j]){
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                    i++;
                } 
	        else{
             if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
                j++;
                }
		}
		while(i<arr1.length){
			 if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
                i++;
		       }
		while(j<arr2.length){
			 if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
                j++;
		}
		
		int a[]=new int[Union.size()];
		for(int index=0;index<Union.size();index++){
			a[index]=Union.get(index);
		}
		return a;
	}
}

class Run{
	public static void main(String[] args){
		Array17 a=new Array17();
		int arr1[]={2,4,5,7,9,17,20};
		int arr2[]={2,5,6,8,9,14,17};
		int x[]=a.union(arr1,arr2);
		for(int i:x){
			System.out.println(i);
		}
	}
}