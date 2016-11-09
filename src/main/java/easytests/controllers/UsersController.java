package easytests.controllers;

import easytests.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


/**
 * Created by fortyways on 03.11.16.
 * Edited by malinink on 07.11.16
 */
@Controller
public class UsersController {

    @RequestMapping("/users")
    public String list(Model model) {

        ArrayList<User> users = new ArrayList<>(3);

        users.add(new User("Dmitry","Alexeevich","Marulin"));
        users.add(new User("Zorigto","Zhargalovich","Dorzhiev"));
        users.add(new User("Djamil","Amirovich","Shaimordanov"));

        model.addAttribute("users", users);
        return "users/list";
    }
}
