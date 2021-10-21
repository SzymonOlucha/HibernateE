import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Movies extends  BaseEntity{

    private String title;
    private int yearOfRelease;
    @ManyToMany(mappedBy = "movies")
    private List<Actors> actors=new ArrayList<>();
    @OneToMany
    private Genres genre;
}
