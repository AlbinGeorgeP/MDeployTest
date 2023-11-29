package com.ManualDeployTest.ManualDeployTest.Services;
import com.ManualDeployTest.ManualDeployTest.Model.User;
import com.ManualDeployTest.ManualDeployTest.Error.UserNotFoundException;
import com.ManualDeployTest.ManualDeployTest.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;


@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    public List<User> GetUsers()
    {
        return userRepository.findAll();
    }


    public User GetUserById(Integer id)
    {

        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("The ID "+id+" not found."));
    }

    public ResponseEntity<String> createUser(User user) {

        try
        {
            user.setCreatedTime(new Date());
            userRepository.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("Success");
        }
        catch (Exception E)
        {
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).body("Request not Created");
        }

    }

    public ResponseEntity<String > deleteUser(Integer id)
    {
        try {
            userRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("The record "+id+" has been deleted");
        }
        catch (Exception e)
        {
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).body("Request not processed");
        }
    }



}
