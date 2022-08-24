package Service;

import Infra.Container;
import Repository.MemberRepository;

public class MemberService {

    private MemberRepository MemberRepository;

    public MemberService(){
        this.MemberRepository = Container.MemberRepository;
    }

    public int saveMember(String loginID, String password, String name){
        return MemberRepository.saveMember(loginID, password, name);
    }

    public boolean isExistsByLoginID(String loginID){
        return MemberRepository.isExistsByLoginID(loginID);
    }

}
