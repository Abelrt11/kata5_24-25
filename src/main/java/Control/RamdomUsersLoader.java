package Control;

import Model.User;
import View.UserProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RamdomUsersLoader {

    public List<User> execute() {
        List<User> users = new ArrayList<>();
        UserProvider provider = new RamdomUserProvider();
        try {
            for (int i= 0; i < 100; i++) users.add(provider.newUser());
            return users;
        } catch (IOException e) {
            return users;
        }
    }
}
