package com.example.spring.demo.lesson2;

public interface UserRepository {

    void save(User user);
    void update(User user);
    void delete(Integer id);
    User get(Integer id);

}
