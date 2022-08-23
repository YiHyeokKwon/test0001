package Infra;

import Controller.Controller;

import java.util.Scanner;

public class Application {

    private Scanner sc = Container.sc;
    private boolean isActive = true;

    public void run(){
        while(isActive){
            System.out.println("명령어 : ");
            String inputUri = sc.nextLine().trim();
            Request request = new Request(inputUri);
            Controller controller = getController(request.getControllerCode());
            if(controller != null){
                controller.execute(request);
            }else{
                System.out.println("올바른 URI를 입력 해 주세요");
            }
        }
    }

    public Controller getController(String code){
        switch (code){
            case "system":
                return Container.systemController;
            default:
                return null;
        }
    }

}
