package model;

public class user {
    public enum Gender {Male, Female}

    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private byte[] photo;

    public String getName() {
        return name;
    }

    public user setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public user setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public user setEmail(String email) {
        this.email = email;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public user setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public user setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }
}
