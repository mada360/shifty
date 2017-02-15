package com.adam.Shifty.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by adam on 10/02/2017.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Message {


    @Id @Generated private long id;
    @NonNull private String message;
    @NonNull private String author;
    @NonNull private Date created;


}
