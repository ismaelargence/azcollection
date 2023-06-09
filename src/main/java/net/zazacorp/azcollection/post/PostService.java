package net.zazacorp.azcollection.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getPosts(){
        return this.postRepository.findAll();
    }
}
