package foreignlanguagecourses;

public class Language {
    private String languageName;
    private String languageGroupInTheWorld;
    private int difficulty;

    public Language(String languageName, String languageGroupInTheWorld, int difficulty) {
        this.languageName = languageName;
        this.languageGroupInTheWorld = languageGroupInTheWorld;
        this.difficulty = difficulty;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageGroupInTheWorld() {
        return languageGroupInTheWorld;
    }

    public void setLanguageGroupInTheWorld(String languageGroupInTheWorld) {
        this.languageGroupInTheWorld = languageGroupInTheWorld;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
