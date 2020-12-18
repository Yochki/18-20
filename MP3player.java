package shop;

public class MP3player extends Electronics {

	private String color;

	/**
	 * Creates a new instance of MP3Player
	 */
	public MP3player(double regularPrice, String manufacturer, String color) {
		super(regularPrice, manufacturer);
		this.color = color;
	}

	// Override this method
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.9;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}