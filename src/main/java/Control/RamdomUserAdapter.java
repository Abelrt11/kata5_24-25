package Control;

import Control.pojo.RamdomUser;
import Model.User;
import View.UserAdapter;

import java.io.IOException;

public class RamdomUserAdapter implements UserAdapter<RamdomUser> {

    @Override
    public User form(RamdomUser object) {
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
        } catch (IOException e){
            Logger.getAnoonymuousLogger().severe(e.getMessage());
    }

    private String firstUpperCase(String gender) {return gender.substring(0, 1).toUpperCase() + gender.substring(1);}
    }

    private byte[] photoFrom(String url) {
        return Jsoup.coonect(url)
                .ignoreContentType(true)
                .execute()
                .bodyAsBytes();
    }
}
