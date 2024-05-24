package com.wo.gestao_vagas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title = "Gestão de Vagas", description = "API responsável pela gestão de vagas", version = "1")
)
public class ProjetoGestaoVagasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoGestaoVagasApplication.class, args);
    }

}
