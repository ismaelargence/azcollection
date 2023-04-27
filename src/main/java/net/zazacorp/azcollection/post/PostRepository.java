package net.zazacorp.azcollection.post;

import net.zazacorp.azcollection.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
