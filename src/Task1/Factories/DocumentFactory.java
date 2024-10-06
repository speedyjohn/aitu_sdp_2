package Task1.Factories;

import Task1.Interfaces.DocumentInterface;

import javax.print.Doc;

public abstract class DocumentFactory {
    public abstract DocumentInterface createDocument();

    public void generateDocument() {
        DocumentInterface documentInterface = createDocument();
        documentInterface.createDocument();
    }
}
