package design_pattern_structural.proxy_pattern.cached;

public class ProxyDemo {
    static void main() {
        // using the image proxy with caching
        Image proxyImage1 = new ImageProxy("sample.jpg");
        proxyImage1.display();

        System.out.println();

        // reusing the cached image
        Image proxyImage2 = new ImageProxy("sample.jpg");
        proxyImage2.display();
    }
}
