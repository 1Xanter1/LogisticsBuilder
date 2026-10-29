package visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements Visitor{
    private String searchText;
    private List<String> results =  new ArrayList<>();

    public SearchVisitor(String searchText) {
        this.searchText = searchText;
    }
    @Override
    public void visitFile(File file) {
        if(file.getName().toLowerCase().contains(searchText.toLowerCase())){
            results.add(file.getName());
        }
    }
    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement element : directory.getElements()){
            element.accept(this);
        }
    }

    public List<String> getResults() {
        return results;
    }
}
