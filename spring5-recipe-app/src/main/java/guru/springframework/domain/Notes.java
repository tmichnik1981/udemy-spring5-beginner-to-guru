package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(exclude = "recipe")
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    //clob field in db
    @Lob
    private String recipeNotes;

}
