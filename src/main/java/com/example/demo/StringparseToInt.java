package com.example.demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringparseToInt {

    /*
        주어진 문자열을 int형으로 변환
     */

    @Test
    public void toIntFromString(){
        assertThat(toIntFromString("123"), is(123));
    }

    private int toIntFromString(String str){
        char[] strArr = str.toCharArray();
        int base = 0;
        for (char c : strArr){
            base *=10;
            base += c-'0';
        }
        return base;
    }
}
