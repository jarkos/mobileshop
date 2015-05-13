package pl.jarkos.users.dao;

import pl.jarkos.model.User;


public interface UserDao {

	User findByUserName(String username);

}