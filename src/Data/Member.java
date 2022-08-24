package Data;

import java.time.LocalDateTime;

public class Member {

    private int ID;

    private String loginID;
    private String password;
    private String name;

    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    public Member(int ID, String loginID, String password, String name){
        this.ID = ID;
        this.loginID = loginID;
        this.password = password;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

}
