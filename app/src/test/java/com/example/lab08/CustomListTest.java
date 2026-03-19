package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }


    public void testdeleteCity() {
        CustomList list = new CustomList();
        City lahore = new City("Lahore", "Punjab");
        City pindi = new City("Pindi", "Punjab");
        list.addCity(lahore);
        list.addCity(pindi);
        list.deleteCity(pindi);
        assertTrue(!list.hasCity((pindi)));
    }

    public int testCountCities() {
        CustomList list = new CustomList();
        City lahore = new City("Lahore", "Punjab");
        City pindi = new City("Pindi", "Punjab");
        City multan = new City("Multan", "Punjab");
        City karanchi = new City("Karanchi", "Sindh");

        list.addCity(lahore);
        list.addCity(pindi);
        list.addCity(multan);
        list.addCity(karanchi);

        assert(list.countCities() == 4);
    }
}