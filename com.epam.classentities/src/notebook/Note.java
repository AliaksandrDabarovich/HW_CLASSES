package notebook;

public class Note {
    private String noteName;
    private String date;

    public Note(String noteName, String date) {
        this.noteName = noteName;
        this.date = date;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
