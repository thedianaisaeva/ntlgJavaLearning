import java.util.Objects;

public class Address {

    String country;
    String city;

    Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return country + ", " + city;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Address other = (Address) obj;
        return (this.country == other.country && this.city == other.city) ||
                ((this.country != null && this.country.equals(other.country))
                        && (this.city != null && this.city.equals(other.city)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}
