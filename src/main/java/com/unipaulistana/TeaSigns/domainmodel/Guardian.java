package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "TBL_GUARDIAN")
public class Guardian extends User{

    private @Getter @Setter String kinship;

}
