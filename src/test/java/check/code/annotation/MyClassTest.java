package check.doodlingCode.annotation;

import org.junit.jupiter.api.*;

/**
 * basic annotation 순서
 */
public class MyClassTest {

    @Test
    @DisplayName("create1")
    public void create1() {
        System.out.println("MyClassTest.create1");
    }
    @Test
    @DisplayName("create2")
    public void create2() {
        System.out.println("MyClassTest.create2");
    }
    @Test
    @DisplayName("create3")
    public void create3() {
        System.out.println("MyClassTest.create3");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("MyClassTest.beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("MyClassTest.beforeEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("MyClassTest.afterAll");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("MyClassTest.afterEach");
    }
}
