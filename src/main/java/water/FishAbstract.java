package water;

public abstract class FishAbstract implements Fish{
	public String size;
	public String color;
	
	public String eat() {
		String eat = "Fish eatting";
		System.out.println(eat);
		return eat;
	}

}
