package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TBL_ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private @Getter @Setter UUID id;

    @Column(name = "NAME", nullable = false, length = 50)
    private @Getter @Setter String name;

    @ManyToMany
    private @Getter @Setter Set<User> user;

}
