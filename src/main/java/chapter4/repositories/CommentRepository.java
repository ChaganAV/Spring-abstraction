package chapter4.repositories;

import chapter4.models.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
