package net.zazacorp.azcollection.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public void deletePostById(String id) {
        this.postRepository.deleteById(id);
    }
}
