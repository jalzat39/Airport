package com.endava.test_pyrmid.airport;

import com.endava.test_pyramid.airport.Passenger;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PassengerTest {

    @Test
    public void testPassengerCreation() {
        Passenger passenger = new Passenger("123-45-6789","John Smith","US");
        assertNotNull(passenger);
    }


}
