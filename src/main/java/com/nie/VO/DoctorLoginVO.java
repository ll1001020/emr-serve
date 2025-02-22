package com.nie.VO;

import lombok.Data;

@Data
public class DoctorLoginVO<T> {
    private Integer code;
    private T data;
}
