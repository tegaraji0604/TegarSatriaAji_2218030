/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4_Enkapsulasi;

/**
 *
 * @author teguh
 */
public class Login {
    private String username, password;
    public String nama;
    
    public Login(){
nama = "Tegar Satria Aji";
username = "Tegar";
password = "Tegar123";
}

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
    this.password=password;
    }
    
    
    boolean Ceklogin (String Username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
         return true;
         
        }
        return false;
    }
}

