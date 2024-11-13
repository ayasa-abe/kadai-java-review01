
public class Review02 {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			// 3と5で割り切れる整数のとき"FizzBuzz"と表示させる
			 if ( i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			// 3で割り切れる整数のとき""Fizz"と表示させる
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			// 5で割り切れる整数のとき"Buzz"と表示させる	
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			//それ以外の数のとき
			} else {
				System.out.println(i);
			}
		}

	}

}
