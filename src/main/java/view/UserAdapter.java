package view;

import model.user;

public interface UserAdapter<T> {
    user from (T object);

}
