interface Document{
    void createDocument();
}

class WordDocument implements Document{
    public void createDocument()
    {
        System.out.println("Word document created");
    }

}

class PdfDocument implements Document{
    public void createDocument()
    {
        System.out.println("Pdf document created");
    }

}
class ExcelDocument implements Document{
    public void createDocument()
    {
        System.out.println("Excel document created");
    }

}


abstract class DocumentFactory{
    abstract Document createDocument();
}

class Wordfactory extends DocumentFactory{
    Document createDocument()
    {
        return new WordDocument();
    }
}
class PdfFactory extends DocumentFactory
{
    Document createDocument()
    {
        return new PdfDocument();
    }
}
class ExcelFactory extends DocumentFactory
{
    Document createDocument()
    {
        return new ExcelDocument();
    }
}



class Test{
    public static void main(String [] args)
    {
        DocumentFactory docfac=new Wordfactory();
        Document doc=docfac.createDocument();
        doc.createDocument();

        DocumentFactory docfac1=new PdfFactory();
        Document doc1=docfac1.createDocument();
        doc1.createDocument();

        DocumentFactory docfac2=new ExcelFactory();
        Document doc2=docfac2.createDocument();
        doc2.createDocument();
    }
}
