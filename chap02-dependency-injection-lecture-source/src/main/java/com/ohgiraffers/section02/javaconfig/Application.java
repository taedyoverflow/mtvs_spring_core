package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Member member = context.getBean(Member.class);

        System.out.println("member = " + member);

        Account account = member.getPersonalAccount();
        System.out.println(account.getBalance());
        System.out.println(account.deposit(10000));
        System.out.println(account.getBalance());
        System.out.println(account.withdraw(5000));
        System.out.println(account.getBalance());
    }
}
