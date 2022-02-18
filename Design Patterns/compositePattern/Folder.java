package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
	private List<Component> components = new ArrayList<>();

	public void add(Component component) {
		components.add(component);
	}

	public void render() {
		for (var component : components) {
			component.render();
		}
	}
}
