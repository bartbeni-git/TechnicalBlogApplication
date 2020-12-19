package bartbeni.service;

import bartbeni.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(User user){
        if(user.getUsername().equals("validuser")){
            return true;
        }
        else {
            return false;
        }
    }
}
