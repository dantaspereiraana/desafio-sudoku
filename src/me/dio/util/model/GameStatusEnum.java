package me.dio.util.model;

public enum GameStatusEnum {
    NON_STARTED("não iniciado "),
    INCOMPLETE ("em andamento "),
    COMPLETE("completo ");

    private final String label;

    GameStatusEnum(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
