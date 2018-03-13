package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The vehicle status to retrieve
 */
public enum StatusEnum {
    ON_TRIP("on_trip"),

    ON_REST("on_rest"),

    AT_ARRIVAL("at_arrival"),

    TIRE_DOWN("tire_down"),

    FUEL_DOWN("fuel_down"),

    REPAIR_DOWN_STATE("repair_down_state"),

    STOPPED("stopped");

    private String value;

    StatusEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
