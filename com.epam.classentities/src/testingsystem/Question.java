package testingsystem;

import java.util.List;

public class Question {
    private String question;
    private List<Option> optionList;

    public Question(String question, List<Option> optionList) {
        this.question = question;
        this.optionList = optionList;
    }

    public String getQuestion() {
        return question;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
