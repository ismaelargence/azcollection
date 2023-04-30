package net.zazacorp.azcollection.post;

import java.util.List;

public interface PostService {

    public List<Post> getPosts();
    public void deletePostById(String name);
}
