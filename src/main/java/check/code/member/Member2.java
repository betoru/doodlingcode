package check.code.member;

import lombok.Data;

@Data
public class Member2 {
    private String name;
    private String phoneNumber;

    public Member2(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
