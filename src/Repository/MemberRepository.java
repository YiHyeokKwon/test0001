package Repository;

import Data.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private int memberID = 0;
    private List<Member> store = new ArrayList<>();

    public int saveMember(String loginID, String password, String name){
        memberID += 1;
        Member member = new Member(memberID, loginID, password, name);
        store.add(member);
        return memberID;
    }

}
