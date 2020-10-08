package guru.springframework.sfgpetclinic.model;

public class Specialty  extends BaseEntity {
    private String discription;

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
