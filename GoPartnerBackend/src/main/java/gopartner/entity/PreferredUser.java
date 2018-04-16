package gopartner.entity;

import gopartner.enums.AgeGroup;
import gopartner.enums.Gender;
import gopartner.enums.Tag;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class PreferredUser implements Serializable {
    private Gender gender;
    private Tag[] tags;
    private AgeGroup ageGroup;
    private Movie movie;
}
