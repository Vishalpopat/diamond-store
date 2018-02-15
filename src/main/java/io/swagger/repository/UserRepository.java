package io.swagger.repository;

import io.swagger.model.User;

public interface UserRepository {

	String createUser(User body);

	String deleteUser(Long userId);

	User getUserById(Long userId);

	String loginUser(String username, String password);

	String updateUser(User body);
}
