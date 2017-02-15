package com.adam.Shifty.beans;

import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.QueryParam;

/**
 * Created by adam on 15/02/17.
 */
@Getter
@Setter
public class EmployeeFilterBean {

    private @QueryParam("year") int year;
    private @QueryParam("start") int start;
    private @QueryParam("size") int size;

}
