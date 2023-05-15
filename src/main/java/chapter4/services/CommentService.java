package chapter4.services;

import chapter4.models.Comment;
import chapter4.repositories.CommentNotificationProxy;
import chapter4.repositories.CommentRepository;
import org.codehaus.plexus.component.annotations.Component;

@Component
public class CommentService {
    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;
    public CommentService(CommentRepository repository, CommentNotificationProxy notificationProxy) {
        this.commentRepository = repository;
        this.commentNotificationProxy = notificationProxy;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
