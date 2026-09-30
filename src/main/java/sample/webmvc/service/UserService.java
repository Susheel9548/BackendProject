package sample.webmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.webmvc.dao.UserDao;
import sample.webmvc.entity.User;

@Service

public class UserService {

	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional(readOnly = false)
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public User getUserById(int id) {
		System.out.println("UserService.getUserById()");

		return userDao.getUserById(id);
	}

	@Transactional(readOnly = false)
	public void updateUser(User user) {
		userDao.updateUser(user);
		System.out.println("UserService.updateUser()");
	}

	@Transactional(readOnly = false)
	public void deleteUser(int id) {
		userDao.deleteUser(id);
		System.out.println("UserService.deleteUser()");

	}

}
