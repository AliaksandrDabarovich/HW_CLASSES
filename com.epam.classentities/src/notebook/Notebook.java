package notebook;

import java.util.Map;

public class Notebook {
    private Map<Note, Boolean> notebook;

    public Notebook(Map<Note, Boolean> notebook) {
        this.notebook = notebook;
    }

    public Map<Note, Boolean> getNotebook() {
        return notebook;
    }

    public void setNotebook(Map<Note, Boolean> notebook) {
        this.notebook = notebook;
    }
}
