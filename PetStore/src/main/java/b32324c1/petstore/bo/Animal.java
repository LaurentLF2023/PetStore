package b32324c1.petstore.bo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="ANIMAL_TYPE")
public class Animal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="BIRTH")
    private Date birth;

    @Column(name="COLOR")
    private String color;

    public Animal() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("id=").append(id);
        sb.append("birth=").append(birth).append('\'');
        sb.append("color=").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
