package hotel_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class Accounts {

    //READ ONLY
    public String EdcelUser = "Cute";
    public String EdcelPass = "123";
    
    public String getEdcelUser(){
        return EdcelUser;
    }
    
    public String getEdcelPass(){
        return EdcelPass;
    }
    
    public String sibayUser = "Sibayan";
    public String sibayPass = "sibay123";
    
    public String getSibayUser(){
        return sibayUser;
    }
    public String getSibayPass(){
        return sibayPass;
    }
    
    public String sargeUser = "Gwapo";
    public String sargePass = "pagalan123";
    
    public String getSargeUser(){
        return sargeUser;
    }
    public String getSargePass(){
        return sargePass;
    }
    
    
    //READ AND WRITE
    
    public static String User = "";
    public static String Pass = "";
    
    public String getUser(){
        return User;
    }
    public String getPass(){
        return Pass;
    }
    
    public static void setUser(String User){
        Accounts.User = User;
    }
    public static void setPass(String Pass){
        Accounts.Pass = Pass;
    }
        
        
    
}
