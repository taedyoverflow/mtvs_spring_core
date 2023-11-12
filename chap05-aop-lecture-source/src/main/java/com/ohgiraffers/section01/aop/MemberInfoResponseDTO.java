package com.ohgiraffers.section01.aop;

import lombok.*;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberInfoResponseDTO {

    private Long id;
    private String name;
}
