package model;

import java.util.List;

public class listModel<T> {
    private List<T> items;

    public listModel() {
    }

    public listModel(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
    listModel<bookModel> bookListModel = new listModel<>();
}
