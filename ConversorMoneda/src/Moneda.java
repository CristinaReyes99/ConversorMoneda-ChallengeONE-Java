import javax.print.DocFlavor;

public record Moneda(String base_code,
                     String target_code,
                     double conversion_result) {
}
