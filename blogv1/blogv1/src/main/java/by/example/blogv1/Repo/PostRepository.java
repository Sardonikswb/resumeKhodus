package by.example.blogv1.Repo;

import by.example.blogv1.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
