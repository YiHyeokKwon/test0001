package Controller;

import Data.Member;
import Infra.Container;
import Infra.Request;
import Service.MemberService;

import java.util.Scanner;

public class MemberController implements Controller {

    private Scanner sc;
    private MemberService memberService;

    public MemberController(){
        this.sc = Container.sc;
    }

    @Override
    public void execute(Request request) {

        switch (request.getTarget()){
            case "join":
                saveMember();
                break;
            default:
                System.out.println("올바른 요청을 보내 주시기 바랍니다.");
                break;
        }

    }

    public void saveMember(){

        System.out.println("== 회원가입 ==");

        System.out.println("ID : ");
        String loginID = sc.nextLine().trim();

        System.out.println("PW : ");
        String password = sc.nextLine().trim();

        System.out.println("이름 : ");
        String name = sc.nextLine().trim();

        int memberID = memberService.saveMember(loginID, password, name);

        System.out.println("환영합니다.");

    }

}
