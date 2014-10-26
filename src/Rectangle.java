public class Rectangle extends Shape {

	protected int width, height, oldWidth, oldHeight;

	public void setWidth(int newWidth) {
		checkSetWidthPreConditions(newWidth);
		this.width = newWidth;
		checkSetWidthPostConditions(newWidth);
	}

	public void setHeight(int newHeight) {
		checkSetHeightPreConditions(newHeight);
		this.height = newHeight;
		checkSetHeightPostConditions(newHeight);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	protected void checkSetWidthPostConditions(int newWidth) {
		if (this.width != newWidth || this.oldHeight != height)
			throw new RuntimeException(
					"setWidth Post Conditions not satisfied! width=" + width
							+ " newWidth=" + newWidth + " oldHeight="
							+ oldHeight + " height=" + height);
	}

	@Override
	protected void checkSetHeightPostConditions(int newHeight) {
		if (this.height != newHeight || this.oldWidth != width)
			throw new RuntimeException(
					"setHeight Post Conditions not satisfied! height=" + height
							+ " newHeight=" + newHeight + " oldWidth="
							+ oldWidth + " width=" + width);
	}

	@Override
	protected void checkSetHeightPreConditions(int newHeight) {
		this.oldHeight = height;
	}

	@Override
	protected void checkSetWidthPreConditions(int newWidth) {
		this.oldWidth = width;
	}

}
