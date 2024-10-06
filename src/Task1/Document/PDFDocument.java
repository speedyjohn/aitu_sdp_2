package Task1.Document;

import Task1.Interfaces.DocumentInterface;

public class PDFDocument implements DocumentInterface {
    @Override
    public void createDocument() {
        System.out.println("The PDF document has been created.");
    }
}
