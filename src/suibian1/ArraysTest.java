package suibian1;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
		
		//  对arr1进行并发排序
		Arrays.parallelSort(arr1);
//		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
//		System.out.println(Arrays.toString(arr2));
		Arrays.parallelPrefix(arr2, 1, 3, new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return left * right;
			}
		});
//		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = new int[5];
//		System.out.println(Arrays.toString(arr3));
		Arrays.parallelSetAll(arr3, new IntUnaryOperator() {

			@Override
			public int applyAsInt(int operand) {
				return operand * 5;
			}
			
		});
//		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = new int[]{10, 9, 8, 7, 6};
		Arrays.parallelSort(arr4, 1, 3);
		System.out.println(Arrays.toString(arr4));
	}

}
