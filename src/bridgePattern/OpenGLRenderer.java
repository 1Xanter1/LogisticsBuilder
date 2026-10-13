package bridgePattern;

public class OpenGLRenderer implements  Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering circle with radius " + radius + " using OpenGL");
    }
    @Override
    public void renderSquare(double side) {
        System.out.println("Rendering square with side of " + side + " using OpenGL");
    }
}
