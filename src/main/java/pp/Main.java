package pp;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.PrintWriterOutput;

import java.io.PrintWriter;
import java.util.Map;

public class Main {

    public static void main(String[]args){
        TemplateEngine templateEngine = TemplateEngine.createPrecompiled(ContentType.Html);

        var messageParams = Map.<String, Object>of(
            "message", "first line <br /> second line"
        );
        /*var messageParams = Map.<String, Object>of(
                "message", new Message("first line <br /> second line")
        );*/
        var out = new PrintWriter(System.out);
        templateEngine.render("message.jte", messageParams, new PrintWriterOutput(out));
        out.flush();
    }
}
