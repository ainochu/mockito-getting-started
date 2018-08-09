package com.andreain.mockitoexample.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author andreain
 */
public class User {

    private Map<String,String> userRoles;

    public User(){
        this.userRoles = new HashMap<String, String>();
    }

    /**
     * Put the different roles/users into the User's bean.
     * @param newRole the new role of the user
     * @param user the name of the user
     */
    public void setRole(String newRole,String user){
        this.userRoles.put(newRole,user);
    }

    /**
     * Put the different roles/users into the User's bean.
     * @param role the new role of the user
     * @return the user associated with the role
     */
    public String getRole(String role){
        return this.userRoles.get(role);
    }
}
