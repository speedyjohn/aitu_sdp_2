package Task2.Interfaces;

import Task2.Interfaces.Components.Button;
import Task2.Interfaces.Components.Checkbox;

public interface ThemeFactory {
    Button createButton();

    Checkbox createCheckbox();
}
