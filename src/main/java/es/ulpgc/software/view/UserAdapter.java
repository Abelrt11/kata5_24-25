package es.ulpgc.software.view;

import es.ulpgc.software.model.User;

public interface UserAdapter<T> {
    User from(T object);
}
