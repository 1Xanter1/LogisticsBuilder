package visitor;

public class SizeCalculatorVisitor implements Visitor{
    private long size;

    @Override
    public void visitFile(File file) {
        size += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement element : directory.getElements()){
            element.accept(this);
        }
    }

    public long getSize() {
        return size;
    }
}
