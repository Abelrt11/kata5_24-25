package Control;

import Control.pojo.RamdomUserResponse;
import Model.User;
import View.UserProvider;
import com.google.gson.Gson;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.sql.Connection;

public class RamdomUserProvider implements UserProvider {
    @Override
    public User newUser() throws IOException {
        Connection connection = Jsoup.connect("https://ramdomuser.me/api").ignoreContentType(true);
        RamdomUserResponse response = new Gson().fromJson(connect.get().text(), RamdomUserResponse.class);
        return new RamdomUserAdapter().from(response.getResults().getFirst());
    }

    private static final String URL = "https://randomuser.me/api/";


}
