package com.adam.Shifty.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by adam on 15/02/17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private String errorMessage;
    private int errorCode;
    private String documentation;

}
