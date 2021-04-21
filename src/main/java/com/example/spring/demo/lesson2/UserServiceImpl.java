package com.example.spring.demo.lesson2;

public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    // ИМПЛЕМЕНТАЦИИ МЕТОДОВ СЕРВИСНОГО СЛОЯ

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public boolean isUserExists(String username) {
        return false;
    }

    @Override
    public boolean isUserAuthorized(String username) {
        return false;
    }
}
