package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "TBL_CRISIS")
public class Crisis {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(name = "NAME", length = 80)
    private @Getter @Setter String name;

    @Column(name = "INITIAL_DATETIME")
    private @Getter @Setter LocalTime initialDateTime;

    @Column(name = "LAST_DATETIME")
    private @Getter @Setter LocalTime lastDateTime;

    @Column(name = "INTENSITY")
    private @Getter @Setter double intensity;

    @Column(name = "EVENT_TRIGGER")
    private @Getter @Setter String eventTrigger;

    @Column(name = "OBSERVATION")
    private @Getter @Setter String observation;

    @ManyToOne
    private @Getter @Setter User user;



}
