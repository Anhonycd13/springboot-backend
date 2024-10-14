@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Spring Boot!";
    }
}

