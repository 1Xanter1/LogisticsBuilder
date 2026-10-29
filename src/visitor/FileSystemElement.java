package visitor;

public interface FileSystemElement {
    void accept(Visitor visitor);
}
