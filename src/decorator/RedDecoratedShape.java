package decorator;

public class RedDecoratedShape extends ShapeDecorator {

	public RedDecoratedShape(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
		
	}
	
	public void setRedBorder(Shape decoratedShape ){
		System.out.println("border color:red");
	}
}
