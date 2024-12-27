package es.ulpgc.software.Control;

import es.ulpgc.software.Control.pojo.RamdomUserProvider;
import es.ulpgc.software.model.User;
import es.ulpgc.software.view.UserProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomUserLoaderCommand {

    public List<User> execute() {
        List<User> users = new ArrayList<>();
        UserProvider provider = new RamdomUserProvider();
        try {
            for (int i = 0; i < 100; i++) { users.add(provider.newUser());}
            return users;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
