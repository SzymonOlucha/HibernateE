import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "actors")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "movies")
@ToString
public class Actors extends BaseEntity {

    private String name;
    private String lastName;
    private int yearOfBirth;
    @ManyToMany
    @JoinTable(name="actors_to_movies",
    joinColumns=@JoinColumn(name = "move_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "actor_id",referencedColumnName = "id"))
    private List<Movies> movies=new ArrayList<>();

}
