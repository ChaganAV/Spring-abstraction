package chapter4.repositories;

import chapter4.models.Comment;
import org.codehaus.plexus.component.annotations.Component;

@Component()
class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment: "+comment.getText());
    }
}
