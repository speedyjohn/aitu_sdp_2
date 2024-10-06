package Task1.Factories;

import Task1.Document.WordDocument;
import Task1.Interfaces.DocumentInterface;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public DocumentInterface createDocument() {
        return new WordDocument();
    }
}
