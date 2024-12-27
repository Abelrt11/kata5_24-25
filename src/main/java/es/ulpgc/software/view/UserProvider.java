package es.ulpgc.software.view;

import es.ulpgc.software.model.User;

import java.io.IOException;

public interface UserProvider {
    User newUser() throws IOException;
}
