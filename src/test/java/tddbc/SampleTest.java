package tddbc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SampleTest {

    @Test
    public void _should_return_Hello_TDD_BootCamp() throws Exception {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertThat(actual, is("Hello TDD BootCamp!"));
    }

}
