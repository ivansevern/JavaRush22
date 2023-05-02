package com.javarush.task.task19.task1904;

import com.javarush.task.task13.task1308.Solution;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
