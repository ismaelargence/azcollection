package net.zazacorp.azcollection.post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public List<Post> getAllPost();
    public void deletePostById(String name);
    public Optional<Post> getById(String id);
}
