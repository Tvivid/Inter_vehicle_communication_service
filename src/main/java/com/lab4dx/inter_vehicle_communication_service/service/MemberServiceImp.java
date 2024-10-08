package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService {



        @Autowired
        private MemberMapper memberMapper;


        public void addMember(Member member) {
            memberMapper.insertMember(member);
        }

        public void updateMember(Member member) {
            memberMapper.updateMember(member);
        }

        public Member getMemberById(String memberId) {
            return memberMapper.selectMemberById(memberId);
        }

        public List<Member> getAllMembers() {
            return memberMapper.getAllMembers();
        }


}
