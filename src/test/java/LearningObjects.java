import model.Address;
import model.Flat;
import model.House;
import model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LearningObjects {
    @Test
    public void workingWithObjects() {
        User alena = new User("Alena", "Mirskaya");
//        alena.setFirstName("Alena");
        //      alena.setLastName("Mirskaya");
        alena.setPhone("+456 463 344");

        User dmitry = new User("Dzmitry", "Mirski");
        dmitry.setFirstName("Dzmiry");
  //      dmitry.setLastName("Mirski");
        dmitry.setPhone("453654344");

        System.out.println(alena.getFirstName() + " " + alena.getLastName() + " " + alena.getPhone());

        System.out.println(dmitry.getFullName() + " " + dmitry.getPhone());
    }

    @Test
    public void workingWithFlat() {
        List<Flat> flats = new ArrayList<>();
        flats.add(new Flat(1));
        flats.add(new Flat(2));
        flats.add(new Flat(3));
        flats.add(new Flat(4));
        flats.add(new Flat(5));

        Address address = new Address("Warsaw", "Strumykowa");

        House houseNr13 = new House();
        houseNr13.setAddress(address);
        houseNr13.setNr(address.getHouseNr());
        houseNr13.setFlats(flats);

        houseNr13.printHouseDetails();
    }
}
