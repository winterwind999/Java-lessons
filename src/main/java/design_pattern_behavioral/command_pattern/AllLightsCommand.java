package design_pattern_behavioral.command_pattern;

import java.util.List;

public class AllLightsCommand implements Command {
    private final List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
