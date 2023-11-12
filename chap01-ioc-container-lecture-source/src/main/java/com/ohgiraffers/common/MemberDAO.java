package com.ohgiraffers.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Component
//@Controller
//@Service
@Repository("dao")
public class MemberDAO {

    private final Map<Integer, Member> memberMap;

    public MemberDAO() {
        this.memberMap = new HashMap<>();

        this.memberMap.put(1, new Member(1, "user01", "pass01", "홍길동"));
        this.memberMap.put(2, new Member(2, "user02", "pass02", "유관순"));
    }

    public Member findMemberBySequence(int sequence) {

        return memberMap.get(sequence);
    }

    public boolean save(Member member) {

        int before = memberMap.size();

        memberMap.put(member.getSequence(), member);

        int after = memberMap.size();

        return after > before? true: false;
    }

}
