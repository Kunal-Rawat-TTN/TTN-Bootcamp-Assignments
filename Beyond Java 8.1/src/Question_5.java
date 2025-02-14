import java.util.Optional;

public class Question_5 {
    public static void main(String[] args) {
        String repeatText = "Bye ! ".repeat(2);
        System.out.println("Repeat Text :- "+repeatText);

        String sampleText = "   \n\t\u2005 Hello Kunal  \t\t ";

        String stripText = sampleText.strip();
        System.out.println("Strip Text :- "+stripText);

        String trimText = sampleText.trim();
        System.out.println("Trim Text :- "+trimText);

        String blankText= "   ";
        System.out.println("Is text empty ? "+ blankText.isEmpty());
        System.out.println("Is text blank ? "+ blankText.isBlank());

        String sampleText2="Hi Kunal";
        System.out.println("Indented Text :- "+sampleText2.indent(50));
        System.out.println("Transform Text :- "+sampleText2.transform(String::toUpperCase));

        String tripleQuoteText = """
                
                Hi Kunal !!
                        Bye bye Kunal !!
                """;
        System.out.println("Triple Quote Text :- "+tripleQuoteText);

        System.out.println("Formatted Text :- Kunal got %d marks".formatted(99));
        System.out.println("TranslateEscapes Text :- \"Hi Kunal \\tRawat\"".translateEscapes());

        String stripIndentText = "\tNotes: Java Session\n"+
                "\t\t1. Streams\n"+
                "\t\t2. Interface\n"+
                "\t\t\ta. Types of Interface\n"+
                "\t\t3. Lambda Expressions";
        System.out.println(stripIndentText);
        System.out.println("Stripe Indent Text :- \n"+stripIndentText.stripIndent());
    }
}
