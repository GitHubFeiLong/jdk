package string;

import java.util.Scanner;

/**
 * @ClassName StringDemo
 * @Description TODO
 * @Author msi
 * @Date 2019/7/22 21:15
 */
public class StringDemo {
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "123";
		System.out.println("str1 == str2:" + (str1 == str2));
		String str3 = new String(str1);
		System.out.println(str1 == str3);
		String str4 = "12" + "3";
		System.out.println(str1 == str4);

		/*charAt()*/
		str1 = "Thinking in java";
		System.out.println(str1.charAt(5)); // i


	}

	/**
	 * 判断回文
	 */
	public void checkHuiWen(){
		// 回文判断
		System.out.println("请输入句子：");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		for (int i = 0; i < inputStr.length() / 2; i++) {
			char c = inputStr.charAt(i);
			char d = inputStr.charAt(inputStr.length() - i - 1);
			if (c != d){
				System.out.println("不是回文");
				return;
			}
		}

		System.out.println("是回文");
	}
}
