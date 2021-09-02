package me.majkelmichel.helloworld;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NormalHelloWorldTest {
    final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final static ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    static void setUpStreams() {

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @org.junit.jupiter.api.Test
    void main() {
        final String expected = "Hello World\r\n";

        NormalHelloWorld.main(new String[] {});
        assertEquals(expected, outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void getHelloWorld() {
        final String expected = "Hello World";

        assertEquals(expected, NormalHelloWorld.getHelloWorld());
    }

    @AfterAll
    static void restoreStreams() {
        final PrintStream originalOut = System.out;
        final PrintStream originalErr = System.err;
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}