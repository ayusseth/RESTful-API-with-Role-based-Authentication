package in.sp.main.service;

import in.sp.main.entities.User;

import java.util.List;

public interface UserService
{

    public User addUser(User user);
    public List<User> getAll();
    public User update(int id, User user);
    public void delete(int id);

}
