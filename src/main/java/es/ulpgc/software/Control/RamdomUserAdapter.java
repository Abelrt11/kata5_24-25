package es.ulpgc.software.Control;

import es.ulpgc.software.Control.pojo.RamdomUser;
import es.ulpgc.software.model.User;
import es.ulpgc.software.view.UserAdapter;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.logging.Logger;

public class RamdomUserAdapter implements UserAdapter<RamdomUser> {


    @Override
    public User from(RamdomUser object) {
        User user = new User()
                .setName(object.getName().first() + " " + object.getName().last())
                .setEmail(object.getEmail())
                .setGender(User.Gender.valueOf(firstUpperCase(object.getGender())));
        loadPhoto(object, user);
        return user;
    }

    private void loadPhoto(RamdomUser object, User user) {
        try {
            user.setPhoto(photoFrom(object.getPicture().medium()));
        } catch (IOException e) {
            Logger.getAnonymousLogger().severe(e.getMessage());
        }
    }

    private byte[] photoFrom(String medium) throws IOException {
        return Jsoup.connect(medium)
                .ignoreContentType(true)
                .execute()
                .bodyAsBytes();
    }

    private String firstUpperCase(String gender) {
        return gender.substring(0, 1).toUpperCase() + gender.substring(1);
    }

}
