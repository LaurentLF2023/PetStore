package b32324c1.petstore.bo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("F")
public class Fish extends Animal{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="LIVINGENV")
    private FishLivEnv livEnv;

    public Fish(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FishLivEnv getLivEnv() {
        return livEnv;
    }

    public void setLivEnv(FishLivEnv livEnv) {
        this.livEnv = livEnv;
    }
}
