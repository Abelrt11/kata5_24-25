package model;

public class User {
    public enum Gender {Male, Female}

    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private byte[] photo;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public User setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }
}
