package b32324c1.petstore.bo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("C")
public class Cat {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="CHIPID")
    private String chipId;

    public Cat(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
