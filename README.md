Bridge Pattern - Shape–Renderer

This project demonstrates the Bridge Design Pattern using a Shape–Renderer example

Description

The project separates shapes from their rendering implementations using composition

Abstraction hierarchy
Shape
Circle
Square
Implementor hierarchy
Renderer
VectorRenderer
RasterRenderer

A shape can use different renderers without changing the shape classes

For example:

Shape circle = new Circle(new VectorRenderer(), 5);
Shape rasterCircle = new Circle(new RasterRenderer(), 5);
Pattern Structure

The Shape abstraction contains a reference to the Renderer interface. This creates the bridge between the two independent hierarchies

The main benefit is that new shapes and renderers can be added independently
