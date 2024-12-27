package es.ulpgc.software;

import es.ulpgc.software.Control.RandomUserLoaderCommand;
import es.ulpgc.software.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new RandomUserLoaderCommand().execute();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}
