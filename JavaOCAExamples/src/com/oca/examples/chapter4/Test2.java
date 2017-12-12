package com.oca.examples.chapter4;

import java.util.*;
import java.util.*;
public class Test2 {
	public static void main(){
	int nums1[] = new int[3];
	int nums2[] = {1,2,3,4,5};
	nums1 = nums2;
	for (int x : nums1){
		System.out.print			(x +":");
	}
}
}