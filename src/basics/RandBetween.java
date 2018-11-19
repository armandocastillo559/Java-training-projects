package basics;

public class RandBetween {

	public static void main(String[] args) {
		System.out.println(randRange(1,100));
	}
		
		public static int randRange(int min, int max) {
			int randNum = (int) (Math.random() * (max - min));
			randNum = randNum + min;
			return randNum;
		}
}
