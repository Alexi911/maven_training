package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "1,4,5",

    })
    void add_behaves_as_expected(int a, int b, int expectedResultadd){
        int result = sample.op(Sample.Operation.ADD,a,b);

        assertThat(result).isEqualTo(expectedResultadd);
    }

    @ParameterizedTest
    @CsvSource({
        "1,4,4",

    })
    void mult_behaves_as_expected(int c, int d, int expectedResultmult){
        int result = sample.op(Sample.Operation.MULT,c,d);

        assertThat(result).isEqualTo(expectedResultmult);
    }
}
