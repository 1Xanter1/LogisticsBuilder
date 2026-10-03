package bridgePattern;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering Circle as vector with radius of " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Rendering Square as vector with side of " + side);
    }
}
