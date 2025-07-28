package in.sp.main.service;

import in.sp.main.entities.User;
import in.sp.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepository userRepo;




    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User update(int id, User newuser) {
        User user= userRepo.findById(id).orElse(null);
        if(user!= null)
        {
            return userRepo.save(newuser);
        }
        else
        {
            throw new RuntimeException("user not found by id "+id);
        }
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
