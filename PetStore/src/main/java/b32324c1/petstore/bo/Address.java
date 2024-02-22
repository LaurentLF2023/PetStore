package b32324c1.petstore.bo;


import jakarta.persistence.*;

@Entity
@Table
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name="NUMBER")
    private String number;

    @Column(name="STREET")
    private String street;

    @Column(name="ZIPCODE")
    private String zipcode;

    @Column(name="CITY")
    private String city;

    public Address() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adress{");
        sb.append("id=").append(id);
        sb.append("number=").append(number).append('\'');
        sb.append("street=").append(street).append('\'');
        sb.append("zipcode=").append(zipcode).append('\'');
        sb.append("city=").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
