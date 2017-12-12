package sa45.team9.inventoryApp.services;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sa45.team9.inventoryApp.model.Role;
import sa45.team9.inventoryApp.model.Suppliers;
import sa45.team9.inventoryApp.model.UserPrincipal;
import sa45.team9.inventoryApp.model.User;
import sa45.team9.inventoryApp.repository.RoleRepository;
import sa45.team9.inventoryApp.repository.UserRepository;

@Service
public class UserServiceManager implements IUserService , UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
    @Override
	public User findUser(String did) {
		return userRepository.findOne(did);
	}
    
	@Override
	public User findUserByName(String username) {
		return userRepository.findByUsername(username);
	}
	@Override
	@Transactional
	public void saveUser(User user) {
		//hard code
		user.setId("4");
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return (UserDetails) new UserPrincipal(user);
	}
	@Override
	public void removeUser(User user) {
		userRepository.delete(user);
	}
	
}
