package b32324c1.petstore.bo;

import jakarta.persistence.*;

@Entity
@Table(name="PETSTORE")
public class PetStore {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="MANAGERNAME")
    private String managerName;

    public PetStore(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetStore{");
        sb.append("id=").append(id);
        sb.append("name=").append(name).append('\'');
        sb.append("managerName=").append(managerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
