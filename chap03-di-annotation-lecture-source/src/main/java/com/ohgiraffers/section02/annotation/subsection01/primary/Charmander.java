package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

    @Override
    public void attack() {
        System.out.println("파이리 공격!!");
    }
}
