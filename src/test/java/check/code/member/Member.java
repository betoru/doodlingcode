package check.code.member;

import lombok.Data;

@Data
public class Member {
    private String name;
    private String phoneNumber;

    public Member(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
