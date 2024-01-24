package com.fullcycle.admin.catalog.domain.validation;

public abstract class Validator {
    private final ValidationHandler handler;

    protected Validator(ValidationHandler anHandler) {
        this.handler = anHandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }
}
