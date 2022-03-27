package org.example.model;

import lombok.*;
import org.example.database.model.Game;
import org.example.database.model.Gamer;
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
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"gamer_id", "game_id"})
})
public class Enroll {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "gamer_id", updatable = false, nullable = false)
    private UUID gamer;
    @Column(name = "game_id", updatable = false, nullable = false)
    private Long game;
}
