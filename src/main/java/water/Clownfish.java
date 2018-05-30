package water;

public class Clownfish extends FishAbstract implements Fish {

	public String size = "small";
	
	public String color = "orange";
	
	public String swim() {
		String swim = "Clownfish swimming";
		System.out.println(swim);
		return swim;
	}

	public void makeJokes () {
		System.out.println("Clownfish make jokes");
	}

}
