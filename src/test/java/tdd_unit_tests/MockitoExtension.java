package tdd_unit_tests;

import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.extension.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Parameter;

public class MockitoExtension implements TestInstancePostProcessor, ParameterResolver {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        MockitoAnnotations.openMocks(testInstance);
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().isAnnotationPresent(Mock.class);
    }

    @Override
    public @Nullable Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return getMock(parameterContext.getParameter(), extensionContext);
    }

    private Object getMock(Parameter parameter, ExtensionContext extensionContext) {
        Class<?> mockType = parameter.getClass();
        ExtensionContext.Store mocks = extensionContext.getStore(ExtensionContext.Namespace.create(MockitoExtension.class, mockType));
        String mockName = getMockName(parameter);

        return mocks.getOrComputeIfAbsent(mockName, key -> Mockito.mock(mockType));
    }

    private String getMockName(Parameter parameter) {
        Mock annotation = parameter.getAnnotation(Mock.class);
        String name = annotation.name();
        if (!name.isEmpty()) {
            return name;
        }
        return parameter.getName();
    }
}
