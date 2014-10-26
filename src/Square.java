public class Square extends Rectangle {

	@Override
	public void setWidth(int width) {
		// Uncomment to check pre conditions
		// checkSetWidthPreConditions(width);
		this.width = width;
		this.height = width;
		// Uncomment to check post conditions
		// checkSetWidthPostConditions(width);
	}

	@Override
	public void setHeight(int height) {
		// Uncomment to check pre conditions
		// checkSetHeightPreConditions(height);
		this.height = height;
		this.width = height;
		// Uncomment to check post conditions
		// checkSetHeightPostConditions(height);
	}
}
