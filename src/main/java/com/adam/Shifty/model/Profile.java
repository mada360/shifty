package com.adam.Shifty.model;

import lombok.*;

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
public class Profile {

    @Id @Generated private long id;
    @NonNull private String profileName;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private Date created;

}
