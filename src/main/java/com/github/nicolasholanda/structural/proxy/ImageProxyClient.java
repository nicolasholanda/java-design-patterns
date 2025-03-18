package com.github.nicolasholanda.structural.proxy;

public class ImageProxyClient {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        // Image is loaded only when display() is called
        image1.display(); 
        System.out.println("-----------------");
        image1.display(); // This time, it does not reload

        System.out.println("-----------------");
        image2.display();
    }
}
