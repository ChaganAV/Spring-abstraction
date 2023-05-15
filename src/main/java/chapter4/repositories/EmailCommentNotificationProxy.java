package chapter4.repositories;

import chapter4.models.Comment;
import org.codehaus.plexus.component.annotations.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "+ comment.getText());
    }
}
