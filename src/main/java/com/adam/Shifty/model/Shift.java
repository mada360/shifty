package com.adam.Shifty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by adam on 15/02/17.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Shift {

    @NonNull private String day;
    @NonNull private String time;


}
