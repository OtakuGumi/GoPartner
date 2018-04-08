package gopartner.entity;

import gopartner.enums.AgeGroup;
import gopartner.enums.Gender;
import gopartner.enums.Tag;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PreferredUser implements Serializable {
    @Getter
    @Id
    private long id;
    @Getter
    @Setter
    @Enumerated
    @Column
    private Gender gender;
    @Getter
    @Setter
    @ElementCollection(targetClass = Tag.class)
    @Enumerated(EnumType.ORDINAL)
    @OrderColumn
    private Tag[] tags;
    @Getter
    @Setter
    @Enumerated
    @Column
    private AgeGroup ageGroup;
}
