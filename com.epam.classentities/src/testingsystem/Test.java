package testingsystem;

import java.util.List;

public class Test {
    private String testName;
    private List<Question> questionList;

    public Test(String testName, List<Question> questionList) {
        this.testName = testName;
        this.questionList = questionList;
    }

    public String getTestName() {
        return testName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
