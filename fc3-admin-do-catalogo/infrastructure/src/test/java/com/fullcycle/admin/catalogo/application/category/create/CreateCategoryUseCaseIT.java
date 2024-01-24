package com.fullcycle.admin.catalogo.application.category.create;

import com.fullcycle.admin.catalogo.IntegrationTest;
import com.fullcycle.admin.catalogo.domain.category.CategoryGateway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
public class CreateCategoryUseCaseIT {
    @Autowired
    private CreateCategoryUseCase useCase;
    @Autowired
    private CategoryGateway categoryGateway;
    @Test
    public void givenAValidCommand_whenCallsCreateCategory_shouldReturnCategoryId() {
        final var expectedName = "Filmes";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var aCommand =
            CreateCategoryCommand.with(expectedName, expectedDescription, expectedIsActive);

    }

}
