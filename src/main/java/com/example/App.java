package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Minimal Java application for TKA-10324 reproducer.
 * The class itself is not the subject of the test —
 * only the Gradle toolchain configuration matters.
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        log.info("Hello from Gradle 9 toolchain-only project");
    }
}
