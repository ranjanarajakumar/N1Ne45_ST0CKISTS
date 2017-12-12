package sa45.team9.inventoryApp.services;
import java.util.List;

import sa45.team9.inventoryApp.model.User;


public interface IUserService {
	public User findUserByName(String name);
	public void saveUser(User user);
	public List<User> getUsers();
	public User findUser(String id);
	void removeUser(User user);
}
