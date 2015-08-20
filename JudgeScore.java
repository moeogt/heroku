import java.util.Scanner;

public class JudgeScore {
	static final int PASS_SCORE = 80;

	public static void main(String[] args) {
		int score = input();
		boolean judge = judge(score);
		output(judge);

	}
	private static int input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("点数を入力してください。");
		int score = Integer.parseInt(scanner.nextLine());
		return score;
	}
	private static boolean judge(int score){
	boolean result = false;
		if(score >= PASS_SCORE){
			result = true;
		}
		return result;
	}
	private static void output(boolean judge){
		if(judge){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
}
}
