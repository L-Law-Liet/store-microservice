package kz.edev.comment.service.impl;
import kz.edev.comment.entity.Comment;
import kz.edev.comment.entity.UserComments;
import kz.edev.comment.repository.CommentRepository;
import kz.edev.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;


    public UserComments getUserComments(Long profileId) {
        List<Comment> comments = commentRepository.findUserComments(profileId);

        UserComments userComments = new UserComments();
        userComments.setComments(comments);
        return userComments;
    }
    public List<Comment> getByUserId(Long id){
        return commentRepository.getByUser_id(id);
    }

    public Comment create(Comment comment){
        return commentRepository.saveAndFlush(comment);
    }

    public void delete(Long id){
        commentRepository.deleteById(id);
    }
}
