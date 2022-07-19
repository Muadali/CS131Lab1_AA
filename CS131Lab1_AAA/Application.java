package game;

public class Application {
	public static void main(String[] args) {
		//Create NonPlayerCharacter object
		nonPlayerCharacter gc=new nonPlayerCharacter("487", "Neutral", false, "AVERAGE");
		//Call methods and display output
		System.out.println(gc.reportStructure());
		System.out.println(gc.introduce());
		System.out.println("Random String:"+gc.exclaim());

		}//end main

}//end class
