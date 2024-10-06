import Task1.Factories.PDFDocumentFactory;
import Task1.Factories.WordDocumentFactory;
import Task2.Application;
import Task2.Interfaces.ThemeFactory;
import Task2.Theme.Factories.DarkThemeFactory;
import Task2.Theme.Factories.LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        documentTest();
        guiTest();
    }

    /**
     * Factory Method.
     * If you need to enter a new document type (for example, an Excel document),
     * you can add it without changing the existing logic.
     * To create this new document type, you will only need a new factory subclass.
    */
    static void documentTest() {
        PDFDocumentFactory pdfDocumentFactory = new PDFDocumentFactory();
        WordDocumentFactory wordDocumentFactory = new WordDocumentFactory();

        pdfDocumentFactory.generateDocument();
        wordDocumentFactory.generateDocument();
    }


    /**
     * Abstract Factory Method.
     * When new themes are introduced (for example, the "Blue Theme"),
     * you can create a new factory for this without changing the existing code.
     * This makes the design open to expansion, but closed to modification (in accordance with the OCP).
     */
    static void guiTest() {
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        ThemeFactory darkThemeFactory = new DarkThemeFactory();

        Application lightThemeApplication = new Application(lightThemeFactory);
        Application darkThemeApplication = new Application(darkThemeFactory);

        System.out.println("Light Theme:");
        lightThemeApplication.displayElements();
        System.out.println();

        System.out.println("Dark Theme:");
        darkThemeApplication.displayElements();
    }
}