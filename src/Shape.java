public abstract class Shape {

	protected abstract void checkSetHeightPreConditions(int newHeight);

	protected abstract void checkSetWidthPreConditions(int newWidth);

	protected abstract void checkSetHeightPostConditions(int newHeight);

	protected abstract void checkSetWidthPostConditions(int newWidth);

}
