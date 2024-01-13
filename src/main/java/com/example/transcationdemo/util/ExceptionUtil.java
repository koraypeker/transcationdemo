package com.example.transcationdemo.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionUtil {

    public static void generateException() {
        throw new RuntimeException();
    }

}
