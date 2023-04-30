package net.zazacorp.azcollection.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return this.postRepository.findAll();
    }

    @Override
    public void deletePostById(String id) {
        this.postRepository.deleteById(id);
    }

    @Override
    public Optional<Post> getById(String id) {
        return this.postRepository.findById(id);
    }
}
