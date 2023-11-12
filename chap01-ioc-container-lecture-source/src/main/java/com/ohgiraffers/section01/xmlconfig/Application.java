package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

//        Member member = (Member) context.getBean("member");

//        Member member = context.getBean(Member.class);

        Member member = context.getBean("member", Member.class);

        System.out.println("member = " + member);
    }
}
