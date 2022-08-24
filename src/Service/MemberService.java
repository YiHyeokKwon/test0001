package Service;

import Infra.Container;
import Repository.MemberRepository;

public class MemberService {

    private MemberRepository MemberRepository;

    public MemberService(){
        this.MemberRepository = Container.MemberRepository;
    }

    public int saveMember(String loginID, String password, String name){
        return 0;
    }

}
