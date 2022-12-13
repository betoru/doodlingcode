package designpattern.creation.builder.after.diretor;

/**
 * fileName       : StudentDirector
 * author         : baehyoyeol
 * date           : 2022/12/11
 * description    :
 */
public class StudentDirector {
    private StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student onlyName() {
        return studentBuilder.name("baehyoyeol").build();
    }
    public Student AllOfInfo() {
        return studentBuilder.name("baehyoyeol").age(19).sex("male").build();
    }
}
