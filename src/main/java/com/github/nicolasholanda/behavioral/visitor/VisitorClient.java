package com.github.nicolasholanda.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        List<Element> elements = Arrays.asList(
            new Text("Hello, Visitor Pattern!"),
            new Image("image.png"),
            new Table(3, 5)
        );

        Visitor renderVisitor = new RenderVisitor();
        Visitor exportVisitor = new ExportVisitor();

        System.out.println("Rendering elements:");
        for (Element element : elements) {
            element.accept(renderVisitor);
        }

        System.out.println("\nExporting elements:");
        for (Element element : elements) {
            element.accept(exportVisitor);
        }
    }
}
