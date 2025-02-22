package com.nie.VO;

import lombok.Data;

@Data
public class PatientLoginVO<T> {
    private Integer code;
    private T data;
}
