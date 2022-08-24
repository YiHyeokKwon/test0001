package Infra;

import Controller.MemberController;
import Controller.SystemController;
import Repository.MemberRepository;
import Service.MemberService;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static SystemController systemController;

    public static final MemberRepository MemberRepository;

    private static final MemberService MemberService;

    private static final MemberController MemberController;

    static{
        sc = new Scanner(System.in);
        systemController = new SystemController();
        MemberRepository = new MemberRepository();
        MemberService = new MemberService();
        MemberController = new MemberController();
    }

}
