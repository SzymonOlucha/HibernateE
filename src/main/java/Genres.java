import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genres extends BaseEntity {
    private String name;
    @OneToMany
    @JoinColumn(name = "genre_id")
    private List<Movies>movies;

}
