package com.example.aftas_v2.service;

import com.example.aftas_v2.model.Member;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface MemberService {
    Member getMemberById(Long id);
    Member addMember(Member member);
    List<Member> searchMember(String name);
    Member updateMember(Member member, Long id);
    void deleteMember(Long id);
}
