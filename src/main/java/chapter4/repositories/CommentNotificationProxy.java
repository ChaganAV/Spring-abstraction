package chapter4.repositories;

import chapter4.models.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
