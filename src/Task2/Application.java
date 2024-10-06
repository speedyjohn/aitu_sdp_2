package Task2;

import Task2.Interfaces.Components.Button;
import Task2.Interfaces.Components.Checkbox;
import Task2.Interfaces.ThemeFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(ThemeFactory themeFactory) {
        button = themeFactory.createButton();
        checkbox = themeFactory.createCheckbox();
    }

    public void displayElements() {
        button.display();
        checkbox.display();
    }
}
