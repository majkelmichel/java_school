package me.majkelmichel.helloworld.abstractfactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseExclamationHelloWorldTest {
    final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final static ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    final static PrintStream originalOut = System.out;
    final static PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void print() {
        HelloWorld obj = new LowercaseExclamationHelloWorld();

        obj.print();

        final String expected = "hello world!\r\n";

        assertEquals(expected, outContent.toString());
    }
}