package view;

import model.User;

import java.io.IOException;

public interface UserProvider {
    User newUser() throws IOException;
}
