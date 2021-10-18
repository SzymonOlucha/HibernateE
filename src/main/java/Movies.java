import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Movies extends  BaseEntity{

    private String title;
    private int yearOfRelease;
    private int genreId;
}
