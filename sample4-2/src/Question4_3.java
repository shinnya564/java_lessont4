
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4_3 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("時間を入力してください");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			System.out.println("今は" + n + "時");
			if(n < 12) {
				System.out.println("おはようございます");
			}else if(n == 12){
				System.out.println("お昼です");
			}else if(n <= 18 && n > 12){
				System.out.println("こんにちは");
			}else if(n <= 23 && n > 18){
				System.out.println("こんばんは");
			}else {
				System.out.println("時刻の範囲を超えています");
			}
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}
}
