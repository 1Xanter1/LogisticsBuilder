package visitor;

public class Client {
    static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");

        root.addElement(new File("notes.txt", 100));
        root.addElement(documents);
        root.addElement(pictures);

        documents.addElement(new File("report.pdf", 500));
        documents.addElement(new File("homework.txt", 200));

        pictures.addElement(new File("photo.jpg", 1000));

        SizeCalculatorVisitor sizeVisitor =
                new SizeCalculatorVisitor();

        root.accept(sizeVisitor);
        System.out.println("Total size: " +
                sizeVisitor.getSize());

        SearchVisitor searchVisitor =
                new SearchVisitor(".txt");

        root.accept(searchVisitor);
        System.out.println("Search results: " +
                searchVisitor.getResults());
    }
}
