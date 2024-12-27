package es.ulpgc.software.Control.pojo;

import com.google.gson.Gson;
import es.ulpgc.software.Control.RamdomUserAdapter;
import es.ulpgc.software.Control.RamdomUserResponse;
import es.ulpgc.software.model.User;
import es.ulpgc.software.view.UserProvider;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class RamdomUserProvider implements UserProvider {
    private static final String URL = "https://randomuser.me/api/";

    @Override
    public User newUser() throws IOException {
        Connection connect = Jsoup.connect(URL).ignoreContentType(true);
        RamdomUserResponse response = new Gson().fromJson(connect.get().text(), RamdomUserResponse.class);
        return new RamdomUserAdapter().from(response.getResults().getFirst());
    }
}
