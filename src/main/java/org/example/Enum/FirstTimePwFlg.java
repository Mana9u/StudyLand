package org.example.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * First Time Pw Flag
 */
public enum FirstTimePwFlg implements EnumBase<FirstTimePwFlg> {
    NOT_FIRST_TIME("0"),
    FIRST_TIME("1");

    @JsonValue
    private final String code;

    FirstTimePwFlg(String code) {
        this.code = code;
    }
    @Override
    public String getCode() { return code; }

    @JsonCreator
    public static FirstTimePwFlg of(String code) {
        return EnumBase.of(FirstTimePwFlg.class, code);
    }
}
