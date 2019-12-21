package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//embedded db
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescription() throws Exception{
        Optional<UnitOfMeasure> unityMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");


        assertEquals("Teaspoon", unityMeasureOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception{
        Optional<UnitOfMeasure> unityMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");


        assertEquals("Cup", unityMeasureOptional.get().getDescription());
    }
}
