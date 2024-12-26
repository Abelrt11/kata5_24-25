package View;

import Model.User;

public interface UserAdapter<T> {
    User form(T object);

}
