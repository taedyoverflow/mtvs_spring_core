package com.ohgiraffers.section02.reflection;

import java.lang.reflect.*;

public class Application {

    public static void main(String[] args) {

        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);

        try {
            Class class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("class3 = " + class3);

            Class class4 = Class.forName("[D");
            System.out.println("class4 = " + class4);

            Class class5 = double[].class;
            System.out.println("class5 = " + class5);

            Class class6 = Class.forName("[Ljava.lang.String;");
            System.out.println("class6 = " + class6);

            Class class7 = String[].class;
            System.out.println("class7 = " + class7);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class class8 = Double.TYPE;
        System.out.println("class8 = " + class8);

        Class class9 = Void.TYPE;
        System.out.println("class9 = " + class9);

        Class superClass = class1.getSuperclass();
        System.out.println("superClass = " + superClass);

        Field[] fields = Account.class.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("modifires : " + Modifier.toString(field.getModifiers())
                    + ", type : " + field.getType()
                    + ", name : " + field.getName());
        }

        Constructor[] constructors = Account.class.getConstructors();
        for(Constructor con : constructors) {
            System.out.println("name : " + con.getName());

            Class[] params = con.getParameterTypes();
            for(Class param : params) {
                System.out.println("param = " + param);
            }
        }

        try {
            Account acc = (Account) constructors[0].newInstance("20", "110-223-123456", "1234", 10000);
            System.out.println(acc.getBalance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        Method[] methods = Account.class.getMethods();
        Method getBalanceMethod = null;
        for(Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " +
                    method.getReturnType().getSimpleName() + " " +
                    method.getName());

            if("getBalance".equals(method.getName())) {
                getBalanceMethod = method;
            }
        }

        try {
            System.out.println(getBalanceMethod.invoke(constructors[2].newInstance()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
