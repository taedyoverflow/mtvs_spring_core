package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@Data
public class Member {

    private int sequence;
    private String id;
    private String pwd;
    private String name;


}
