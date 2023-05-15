package chapter4;

import chapter4.models.Comment;
import chapter4.repositories.CommentNotificationProxy;
import chapter4.repositories.CommentRepository;
//import chapter4.repositories.DBCommentRepository;
import chapter4.repositories.EmailCommentNotificationProxy;
import chapter4.services.CommentService;
import chapter4.services.ProjectConfiguration;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Comment comment = new Comment();
        comment.setAuthor("Chagan");
        comment.setText("Great day");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}