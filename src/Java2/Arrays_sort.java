package Java2;

import java.util.Arrays;

public class Arrays_sort {
	public static void main(String[] args) {
//		int[] scores = { 99, 68, 36, 29, 88 };
//		Arrays.sort(scores);
//
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("scores[" + i + "]" + scores[i]);
//		}
//
//		String[] names = { "홍길동", "박동수", "김민수" };
//		Arrays.sort(names);
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("names[" + i + "]" + names[i]);
//		}
		int[] scores = { 99, 68, 36, 29, 88 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);

		}
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("index : " + index);
		//오름차순 정렬 만 바이너리설치 이용가능
	}
}
