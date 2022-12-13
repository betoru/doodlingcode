package designpattern.creation.builder.after.diretor;

/**
 * <p>fileName       : Student3</p>
 * <p>author         : baehyoyeol</p>
 * <p>date           : 2022/12/09</p>
 * <p>description    : 점층적 생성자 패턴과 자바빈 패턴의 장점을 결합한 패턴</p>
 * <p>                 필요한 객체를 직접 생성하는 대신, 먼저 필수 인자들을 생성자에 전부 전달하여 빌더 객체를 만든다.</p>
 * <p>                 그리고 선택 인자는 가독성이 좋은 코드로 인자를 넘길 수 있다.</p>
 * <p>                 setter가 없으므로 객체 일관성을 유지하여 불변 객체로 생성할 수 있다.</p>
 */
public class ConcreteStudentBuilder implements StudentBuilder {
    private long sequence;
    private String name;
    private int age;
    private String sex;

    @Override
    public StudentBuilder sequence(long sequence) {
        this.sequence = sequence;
        return this;
    }

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder sex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public Student build() {
        return new Student(sequence, name, age, sex);
    }
}
