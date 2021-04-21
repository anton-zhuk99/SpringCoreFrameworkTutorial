package com.example.spring.demo.lesson2;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save(User user) {
        System.out.println("Save user");
    }

    @Override
    public void update(User user) {
        System.out.println("Update user");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Delete user");
    }

    @Override
    public User get(Integer id) {
        return new User();
    }
}
