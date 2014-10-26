public class ShapeDrawer {

	public static void drawShape(Shape shape) {
		if (shape.getClass().equals(Square.class))
			drawSquare((Square) shape);
		else if (shape.getClass().equals(Rectangle.class))
			drawRectangle((Rectangle) shape);
	}

	private static void drawRectangle(Rectangle rectangle) {
		// Draw a Square somehow
	}

	private static void drawSquare(Square square) {
		// Draw a rectangle somehow
	}

}
