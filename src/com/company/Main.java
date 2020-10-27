package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String original = "My name is Meeeeeeeex";
        String edited = original.replaceAll("e{2,}", "a");
        System.out.println(edited);
    }
}
