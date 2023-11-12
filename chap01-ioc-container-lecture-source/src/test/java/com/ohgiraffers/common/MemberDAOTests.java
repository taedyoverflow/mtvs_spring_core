package com.ohgiraffers.common;

import com.ohgiraffers.section03.subsection01.java.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class MemberDAOTests {

    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void testCreateMemberDAO() {

        assertNotNull(memberDAO);
    }

    @Test
    public void testFindMemberbySequence() {

        //given
        int sequence = 1;

        //when
//        MemberDAO memberDAO = new MemberDAO();
        Member foundMember = memberDAO.findMemberBySequence(sequence);

        //then
        assertEquals("홍길동", foundMember.getName());
    }

    @Test
    public void testSave() {

        //given
        Member member = new Member(3, "user03", "pass03", "유관순");

        //when
        boolean result = memberDAO.save(member);

        //then
        assertTrue(result);
    }
}
