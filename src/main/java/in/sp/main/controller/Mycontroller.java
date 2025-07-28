package in.sp.main.controller;


import in.sp.main.entities.User;

import in.sp.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller
{
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUserDetail(@RequestBody User user)
    {
        return userService.addUser(user);
    }
    @GetMapping("/getall")
    public List<User> getAllUser()
    {
        return userService.getAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user)
    {
        User updateUser=userService.update(id, user);
        if(updateUser!=null)
        {
            return ResponseEntity.ok(updateUser);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id)
    {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
