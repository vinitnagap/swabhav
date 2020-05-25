package lsp.violation;

public class Sqaure extends Rectangle {

	public Sqaure(int side) {
		super(side, side);
	}

	@Override
	public void setWidth(int width) {
		this.width = height = width;
	}

	@Override
	public void setHeight(int height) {
		width = this.height = height;
	}

}
