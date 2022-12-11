package check.doodlingCode.member;

import java.util.ArrayList;

public class MemberTest {
    public static void main(String[] args) {
        System.out.println("MemberTest.main");
        Member2 member1 = new Member2("이순신","01011112222");
        Member2 member2 = new Member2("홍길동","01012345678");
        ArrayList<Member2> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        for (Member2 member : members) {
            System.out.println("member.toString() = " + member.toString());
        }
    }
}
