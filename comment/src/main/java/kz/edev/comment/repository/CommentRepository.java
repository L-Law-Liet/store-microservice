package kz.edev.comment.repository;

import kz.edev.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> getByUser_id(Long id);

    @Query(value = "SELECT * FROM comment c WHERE c.user_id=?1", nativeQuery = true)
    List<Comment> findUserComments(Long id);
}
