package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("...@BeforeAll...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In @BeforeEach...");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("...In @AfterEach");

    }

    @AfterAll
    public static void afterClass() {
        System.out.println("...@AfterAll...");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Ryan"));
    }
}