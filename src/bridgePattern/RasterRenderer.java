package bridgePattern;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering Circle as pixels with radius of " + radius);
    }
    @Override
    public void renderSquare(double side) {
        System.out.println("Rendering Square as pixels with side of " + side);
    }
}
