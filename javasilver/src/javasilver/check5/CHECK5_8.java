package javasilver.check5;

public class CHECK5_8 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] array = { { "a", "b" }, null, { "c", "d" } };
		int total = 0;
		for (String[] tmp : array) {
			total += tmp.length;
		}
		System.out.println(total);
	}
	
}
