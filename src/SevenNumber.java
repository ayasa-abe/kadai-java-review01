
public class SevenNumber {

	public static void main(String[] args) {
		//i の値を1から100より小さい間、1ずつカウントアップして繰り返す
		for (int i =1; i < 100; i++) {
			//iの値が7の倍数のとき
			if (i % 7 == 0 || i % 10 == 7 || i /10 == 7) {
				System.out.println("clap!");
			} else {
				System.out.println(i);
	
		    }
    	}
	}
}
