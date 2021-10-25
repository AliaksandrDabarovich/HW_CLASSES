package electronicjournal;

import java.util.Map;

public class Journal {
    private Map<Student, Boolean> studentList;

    public Journal(Map<Student, Boolean> studentList) {
        this.studentList = studentList;
    }

    public Map<Student, Boolean> getStudentList() {
        return studentList;
    }

    public void setStudentList(Map<Student, Boolean> studentList) {
        this.studentList = studentList;
    }
}
