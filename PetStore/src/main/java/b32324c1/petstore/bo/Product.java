package b32324c1.petstore.bo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="CODE")
    private String code;

    @Column(name="LABEL")
    private String label;

    @Column(name="TYPE")
    private ProdType type;

    @Column(name="PRICE")
    private Double price;

    @ManyToMany
    private List<PetStore> PetStores;

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append("code=").append(code).append('\'');
        sb.append("label=").append(label).append('\'');
        sb.append("type=").append(type).append('\'');
        sb.append("price=").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
