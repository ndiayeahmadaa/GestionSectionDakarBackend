package sn.ahiba.gmembrebacken.configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerDocumentationConfig {

    @Value("${ahiba.openapi.url}")
    private String url;
    @Bean
    public OpenAPI myOpenAPI() {
        Server server = new Server();
        server.setUrl(url);
        server.setDescription("Server URL");

        Contact contact = new Contact();
        contact.setEmail("sectiondakar.gmail.com");
        contact.setName("Section Dakar");
        contact.setUrl("https://www.sectiondakar.sn");

        License maLicence = new License().name("Apache License").url("http://www.apache.org/licenses/LICENSE-2.0.html");

        Info info = new Info().
                title("Section Dakar Management API")
                .version("1.0")
                .contact(contact)
                .description("Cet API expose endpoints pour manager section dakar")
                .license(maLicence);

        return new OpenAPI().info(info).servers(List.of(server));

}
}
