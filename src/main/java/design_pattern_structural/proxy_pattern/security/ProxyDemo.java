package design_pattern_structural.proxy_pattern.security;

public class ProxyDemo {
    static void main() {
        SensitiveResource unauthorizedProxy = new SecurityProxy("bryan");
        unauthorizedProxy.accessResource();

        System.out.println("Now access with credentials");

        SensitiveResource authorizedProxy = new SecurityProxy("admin");
        authorizedProxy.accessResource();
    }
}
