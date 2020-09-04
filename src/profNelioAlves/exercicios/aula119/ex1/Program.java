package profNelioAlves.exercicios.aula119.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(sdf.parse("21/06/2018 13:05:48"), "Teste123", "Testando testando", 5 );

        Comment comment = new Comment("Wow, teste!");
        Comment comment1 = new Comment("WTF, teste!");

        post.addComment(comment);
        post.addComment(comment1);

        Post post1 = new Post(sdf.parse("15/01/2015 03:49:10"), "Outro Teste", "Testindo testindo", 99 );

        Comment comment2 = new Comment("Wow, outro teste!");
        Comment comment3 = new Comment("OOF, mais um teste!");

        post1.addComment(comment2);
        post1.addComment(comment3);

        System.out.println(post);
        System.out.println(post1);

    }
}
