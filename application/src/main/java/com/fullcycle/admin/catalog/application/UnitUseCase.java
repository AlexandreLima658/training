package com.fullcycle.admin.catalog.application;

public abstract class UnitUseCase<ID> {
    public abstract void execute(ID anId);
}
