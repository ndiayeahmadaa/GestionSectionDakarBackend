package sn.ahiba.gmembrebacken.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Profile("swagger")
@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

    @Bean
    public Docket apiDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.select().apis(RequestHandlerSelectors.basePackage("sn.ahiba.gmembrebacken.controllers")).paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo());

        return docket;

    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Gestion Membre Dahira").description("").title("Documentation API Gestion Membre Dahira")
                .contact(new Contact("Equipe dev", "www.portdakar.sn", "dsi@portdakar.sn")).license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").version("1.0.0").build();
    }
}
