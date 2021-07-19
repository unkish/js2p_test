package my.pkg;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import my.pkg.GenericResponse.Fruit;

class GenericResponseTest {

    @Test
    void test() throws IOException {
        final var expectedResponse = new GenericResponse().withFresh(Fruit.CHERRY).withSpoil(Fruit.BANANA);
        final var objectMapper = new ObjectMapper();
        final var serialized = objectMapper.writeValueAsString(expectedResponse);
        System.out.println(serialized);
        Assertions.assertEquals(expectedResponse, objectMapper.readValue(serialized, GenericResponse.class));
    }
}
