/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.User;

/**
 *
 * @author Hoang
 */
public interface UserDAO {
    public boolean userRegister(User us);
    public User login(String email, String password);
}
