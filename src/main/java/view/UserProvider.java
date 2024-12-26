package view;

import model.user;

import java.io.IOException;

public interface UserProvider {
    user newUser() throws IOException;
}
