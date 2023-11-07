package com.github.curriculeon;

// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
public class StringRepeater {
    public String stringRepeater(int n, String s) {
        for (int i = 0; i < n; i++) {
            s += s;
        }
        return s;
    }
}
