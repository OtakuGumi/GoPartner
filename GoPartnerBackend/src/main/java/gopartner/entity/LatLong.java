package gopartner.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class LatLong {
    @Id
    @Getter
    private long id;
    @Getter
    @Setter
    private String latitude;
    @Getter
    @Setter
    private String longitude;
}
