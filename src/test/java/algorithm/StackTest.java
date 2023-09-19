package algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    @DisplayName("스택 테스트")
    void stackTest() {
        Stack stack = new Stack();
        stack.push(10);
        stack.top();
        stack.size();
        stack.push(20);
        stack.top();
        stack.size();
        stack.pop();
        stack.top();
        stack.size();
        stack.pop();
        stack.empty();
    }
}
