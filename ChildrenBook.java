package shop;

public class ChildrenBook extends Book {
	private int age;

	public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice, publisher, yearPublished);
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Override this method
		public double computeSalePrice() {
			return super.getRegularPrice() * 0.3;
		}
}