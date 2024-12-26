package view;

import model.User;

public interface UserAdapter<T> {
    User from (T object);

}
