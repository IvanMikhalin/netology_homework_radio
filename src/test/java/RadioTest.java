import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(30);

    @Test
    public void shouldSetDirectStationIfMoreThenChanels() {
        radio.setDirectStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStation() {
        radio.setDirectStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStationIfLessThenMin() {
        radio.setDirectStation(radio.getMinStation() - 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectStationIfMoreThenMax() {
        radio.setDirectStation(radio.getMaxStation() +1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setPrevStation(9);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationIfPrevIsNull() {
        radio.setPrevStation(radio.getMinStation());

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        radio.setNextStation(0);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNullStationIfCurrentIsMax() {
        radio.setNextStation(radio.getMaxStation());

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchVolumeUp() {
        radio.setVolumeUp(9);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMaxVolumeIfAlreadyMax() {
        radio.setVolumeUp(radio.getMaxVolume());

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        radio.reduceVolume(9);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMinVolumeIfAlreadyMin() {
        radio.reduceVolume(radio.getMinVolume());

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}