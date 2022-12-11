package check.doodlingCode.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    MemberMapper memberMapper;

//    public MemberService(MemberMapper memberMapper) {
//        this.memberMapper = memberMapper;
//    }

//    public List<Member> list() {
//        return memberMapper.selectAllMembers();
//    }
//
//    public int insert(Member member) {
//        return memberMapper.insertMember(member);
//    }
//
//    public int delete(int id) {
//        return memberMapper.deleteMember(id);
//    }
//
//    public Member detail(int id) {
//        return memberMapper.selectById(id);
//    }
//
//    public int update(Member member) {
//        return memberMapper.updateMember(member);
//    }
}
