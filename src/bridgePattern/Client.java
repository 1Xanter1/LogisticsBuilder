package bridgePattern;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        Renderer vectorRenderer =  new VectorRenderer();
        Renderer rasterRenderer =  new RasterRenderer();

        Shape rasterCircle = new Circle(rasterRenderer,4);
        Shape rasterSquare = new Square(rasterRenderer,3);

        rasterCircle.draw();
        rasterSquare.draw();

        System.out.println();

        Shape vectorCircle = new Circle(rasterRenderer,6);
        Shape vectorSquare = new Square(rasterRenderer,5);

        vectorCircle.draw();
        vectorSquare.draw();
    }
}
