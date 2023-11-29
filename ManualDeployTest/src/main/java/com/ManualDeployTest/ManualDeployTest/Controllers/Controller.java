package com.ManualDeployTest.ManualDeployTest.Controllers;
import com.ManualDeployTest.ManualDeployTest.Model.User;
import com.ManualDeployTest.ManualDeployTest.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/V1/DatabaseFetch")
public class Controller {

    @Autowired
    private UserServices userServices;
    @GetMapping(value="getUsers",produces = "application/json")
    public List<User> GetUsers()
    {
        return userServices.GetUsers();
    }

    @GetMapping(value="getUser",produces = "application/json")
    public User GetUserById(@RequestParam("id") Integer id)
    {
        return userServices.GetUserById(id);
    }

    @PostMapping(value = "createUser",produces = "application/json",consumes = "application/json")
        public ResponseEntity<String> createUser(@RequestBody User user)
    {
       return userServices.createUser(user);
    }

    @DeleteMapping(value = "userDelete",produces = "application/json")
    public ResponseEntity<String > deleteUser(@RequestParam("id") Integer id)
    {
        return userServices.deleteUser(id);
    }

}
