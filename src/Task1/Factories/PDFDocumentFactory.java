package Task1.Factories;

import Task1.Document.PDFDocument;
import Task1.Interfaces.DocumentInterface;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public DocumentInterface createDocument() {
        return new PDFDocument();
    }
}
