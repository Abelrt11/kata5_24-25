package View;

import Model.User;

import java.io.IOException;

public interface UserProvider {
    User newUser() throws IOException;
}
