package jcorreaw.stdDataJpa;

import jcorreaw.stdDataJpa.model.User;
import jcorreaw.stdDataJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("João");
        user.setUsername("jcorreaw");
        user.setPassword("12345");

        repository.save(user);
    }
}
