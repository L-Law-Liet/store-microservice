package kz.edev.comment.service;

import kz.edev.comment.entity.Comment;
import kz.edev.comment.entity.UserComments;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    UserComments getUserComments(Long id);
    Comment create(Comment comment);
    void delete(Long id);
}
