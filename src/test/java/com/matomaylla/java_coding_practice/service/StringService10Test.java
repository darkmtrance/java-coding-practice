package com.matomaylla.java_coding_practice.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringService10Test {
    /**
     * Method under test: {@link StringService10#printStringsBadPractice(List)}
     */
    @Test
    void testPrintStringsBadPractice() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();
        stringService10.printStringsBadPractice(new ArrayList<>());
    }

    /**
     * Method under test: {@link StringService10#printStringsBadPractice(List)}
     */
    @Test
    void testPrintStringsBadPractice2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();

        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        stringService10.printStringsBadPractice(list);
    }

    /**
     * Method under test: {@link StringService10#printStringsBadPractice(List)}
     */
    @Test
    void testPrintStringsBadPractice3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();

        ArrayList<String> list = new ArrayList<>();
        list.add("42");
        list.add("foo");
        stringService10.printStringsBadPractice(list);
    }

    /**
     * Method under test: {@link StringService10#printStringsGoodPractice(List)}
     */
    @Test
    void testPrintStringsGoodPractice() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();
        stringService10.printStringsGoodPractice(new ArrayList<>());
    }

    /**
     * Method under test: {@link StringService10#printStringsGoodPractice(List)}
     */
    @Test
    void testPrintStringsGoodPractice2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();

        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        stringService10.printStringsGoodPractice(list);
    }

    /**
     * Method under test: {@link StringService10#printStringsGoodPractice(List)}
     */
    @Test
    void testPrintStringsGoodPractice3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        StringService10 stringService10 = new StringService10();

        ArrayList<String> list = new ArrayList<>();
        list.add("42");
        list.add("foo");
        stringService10.printStringsGoodPractice(list);
    }
}

