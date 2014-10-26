import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void shapeRectangle_OK() {
		Rectangle rectangle = new Rectangle();
		shapeRectangle(rectangle, 5, 4);

		assertEquals(20, rectangle.getWidth() * rectangle.getHeight());
	}

	@Test
	public void shapeSquare_KO() {
		Square square = new Square();
		shapeRectangle(square, 5, 4);

		assertEquals(20, square.getWidth() * square.getHeight());
	}

	private void shapeRectangle(Rectangle rectangle, int width, int height) {
		rectangle.setWidth(width);
		rectangle.setHeight(height);
	}
}
