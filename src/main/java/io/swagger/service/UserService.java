package io.swagger.service;

import io.swagger.model.User;

public interface UserService {

	String createUser(User body);

	String deleteUser(Long userId);

	User getUserById(Long userId);

	String loginUser(String username, String password);

	String updateUser(User body);

}
