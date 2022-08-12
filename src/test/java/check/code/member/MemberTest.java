package check.code.member;

import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * test 할때 data object 에 lombok 기능이 안되는 경우가 있음
 * 사용하려면 main package 와 싱크가 맞아야 함.
 * 패키지 맞추라공 >:(
 */
public class MemberTest {

    @Test
    @DisplayName("기초데이터 main package class")
    void makeDataByObject() {
        Member2 member1 = new Member2("홍길동", "01011112222");
        Member2 member2 = new Member2("신사임당", "01033334444");
        ArrayList<Member2> members = new ArrayList<>();
        members.add(member1);
    }

    @Test
    @DisplayName("기초데이터 test package class")
    void makeDataByTestObject() {
        Member member = new Member("테스트", "01033333333");
        ArrayList<Member> members = new ArrayList<>();
        members.add(member);
    }

    @Test
    @DisplayName("기초데이터 test inner class")
    void makeDataByInnerClass() {
        Item item = new Item("아이템1", 10000);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
    }

    @Data
    public class Item {
        private String itemName;
        private Integer price;

        public Item(String itemName, Integer price) {
            this.itemName = itemName;
            this.price = price;
        }
    }

}
