package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringReverse {

    /*
        문자열을 역순으로 출력한다.
     */

    @Test
    public void tesst(){
        assertThat(solution1("abc"), is("cba"));
    }

    // 1.새로운 배열에 담기
    public String solution1(String str){
        char[] charArr = str.toCharArray();
        char[] resultArr = new char[charArr.length];

        for(int i=0; i<charArr.length; i++){
            resultArr[charArr.length -i -1] = charArr[i];
        }
        return new String(resultArr);
    }


    // 2. swap하기
//    public String solution2(String str){
//        char[] charArr = str.toCharArray();
//
//        for(int i=0; i<charArr.length/2; i++){
//            Utils
//        }
//    }
}
