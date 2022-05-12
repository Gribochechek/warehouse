package nl.averageflow.springwarehouse.infrastructure.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Warehouse",
                description = "Warehouse API"))
@Configuration
public class OpenApiConfig {

}
