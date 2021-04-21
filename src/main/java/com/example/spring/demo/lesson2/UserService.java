package com.example.spring.demo.lesson2;

public interface UserService {

    // СЕРВИСНЫЕ МЕТОДЫ
    User getUserById(Integer id);
    boolean isUserExists(String username);
    boolean isUserAuthorized(String username);

}
