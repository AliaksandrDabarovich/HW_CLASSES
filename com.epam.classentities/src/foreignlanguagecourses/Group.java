package foreignlanguagecourses;

import java.util.List;

public class Group {
    private Teacher teacher;
    private Language language;
    private List<Student> studentsList;

    public Group(Teacher teacher, Language language, List<Student> studentsList) {
        this.teacher = teacher;
        this.language = language;
        this.studentsList = studentsList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
