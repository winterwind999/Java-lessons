package design_pattern_structural.proxy_pattern.example;

import java.lang.reflect.Proxy;

public class ProxyEverydayDemo {
    static void main() {
        CustomService customService = new CustomServiceImpl();

        customService.doServiceCall();

        CustomInvocationHandler<CustomService> customHandler = new CustomInvocationHandler<>(customService);

        CustomService proxyService = (CustomService) Proxy.newProxyInstance(
                customService.getClass().getClassLoader(),
                new Class[] {CustomService.class},
                customHandler);

        proxyService.doServiceCall();
    }
}
