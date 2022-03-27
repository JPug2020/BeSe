package org.example.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Builder
@Entity
public class Credit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "gamer_id", updatable = false, nullable = false)
    private UUID gamer;
    @Column(name = "credit", updatable = false, nullable = false)
    private int credit;
}
