package com.mtd.ecom_server.repos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.mtd.ecom_server.models.User;

public interface UserRepo extends MongoRepository<User, String> {
    List<User> findByEmail(String email);

}
