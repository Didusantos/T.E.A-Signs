package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TBL_USER",  indexes = {@Index( name = "IDX_EMAIL_PASSWORD",
        columnList = "email, password"),
        @Index( name = "IDX_EMAIL", columnList = "email"),
        @Index( name = "IDX_PASSWORD", columnList = "password")
})
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID", nullable = false)
    private @Getter @Setter UUID id;

    @Column(name = "NAME",length = 25, nullable = false)
    private @Getter @Setter String name;

    @Column(name = "EMAIL",length = 60)
    private @Getter @Setter String email;

    @Column(name = "PASSWORD", length = 12)
    private @Getter @Setter String password;

    @Column(name = "CELLPHONE")
    private @Getter @Setter String cellphone;

    @ManyToMany
    private @Getter @Setter Set<Role> role;

    @OneToMany
    private @Getter @Setter Set<Device> device;

    @ManyToMany
    private @Getter @Setter Set<Crisis> crisis;
}
