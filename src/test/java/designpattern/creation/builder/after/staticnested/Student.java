package designpattern.creation.builder.after.staticnested;

/**
 * <p>fileName       : Student</p>
 * <p>author         : baehyoyeol</p>
 * <p>date           : 2022/12/06</p>
 * <p>description    : No Annotation ver.객체를 만들 때 사용하는 빌더테스트 패턴2</p>
 * <p>                 생성패턴은 객체 생성하는 것을 분리함으로써 클라이언트와 결합성을 낮추도록 함.</p>
 * <p>                 반드시 필수로 요구되는 필드외 optional 함을 고려한 방식</p>
 * <p>                 그런데 빌드와 빌더 간 역종속은 논란의 여지가 있다.</p>
 */
public class Student {
    private long sequence;
    private String name;
    private int age;
    private String sex;

    private Student(StudentBuilder builder) {
        this.sequence = builder.sequence;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public long getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
              "sequence=" + sequence +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex='" + sex + '\'' +
              '}';
    }

    public static class StudentBuilder {
        private long sequence;
        private String name;
        private int age;
        private String sex;

        public StudentBuilder(long sequence, String name) {
            this.sequence = sequence;
            this.name = name;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
