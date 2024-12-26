package control.pojo;

public class RamdomUser {
    private String gender;
    private Name name;
    private String email;
    private Picture picture;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Picture getPicture() {
        return picture;
    }

    public record Name(String title, String first, String Last) {
        public String last() {
            return Last;
        }
    }

    public record Picture(String large, String medium, String thumbnail) {}
}
