package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("入力してください!");
		int num = sc.nextInt();

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.println("値を入力してください!");
			array[i] = sc.nextInt();

		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("キーを入力してください!");
		int key = sc.nextInt();

		searchIdx(array, num, key, list);

		sc.close();

	}

	static void searchIdx(int[] array, int num, int key, ArrayList<Integer> list) {

		int count = 0;

		for (int i = 0; i < num; i++) {

			if (array[i] == key) {

				list.add(i);

				count++;
			}

		}

		
		for (int i = 0; i < list.size(); i++) {

			System.out.printf("i=%d番の値=%d\n", i, list.get(i));
		}

		System.out.println("一致する値" + count);

	}

}
