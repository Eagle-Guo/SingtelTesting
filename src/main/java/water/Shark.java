package water;

public class Shark extends FishAbstract implements Fish {

	public String size = "large";
	
	public String color = "grey";
	
	public String swim() {
		String swim = "Shark swimming";
		System.out.println(swim);
		return swim;
	}
	
	@Override
	public String eat() {
		String eat = "Shark eat other fish";
		System.out.println(eat);
		return eat;
	}

}
