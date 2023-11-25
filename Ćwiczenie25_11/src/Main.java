
public class Main {

	public static void main(String[] args) {

		
		String food1 = "pizza";
		String food2 = "hotdog";
 		String foodEmpty = "";
 		
		System.out.println(food1);
		System.out.println(food2);
		foodEmpty = food1;
		food1 = food2;
		food2 = foodEmpty;
		System.out.println("Zamienione: " + food1);
		System.out.println("Zamienione: " + food2);

	}

}
