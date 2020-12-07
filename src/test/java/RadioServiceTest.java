import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {
    int[] currentWave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int[] currentVolume= {0,1,2,3,4,5,6,7,8,9,10};
    RadioService service = new RadioService();

    @Test
    void buttonWale0() {
        int expected = 0;
        assertEquals(expected, service.ButtonWale0());
    }

    @Test
    void buttonWale1() {
        int expected = 1;
        assertEquals(expected, service.ButtonWale1());
    }

    @Test
    void buttonWale2() {
        int expected = 2;
        assertEquals(expected, service.ButtonWale2());
    }

    @Test
    void buttonWale3() {
        int expected = 3;
        assertEquals(expected, service.ButtonWale3());
    }

    @Test
    void buttonWale4() {
        int expected = 4;
        assertEquals(expected, service.ButtonWale4());
    }

    @Test
    void buttonWale5() {
        int expected = 5;
        assertEquals(expected, service.ButtonWale5());
    }

    @Test
    void buttonWale6() {
        int expected = 6;
        assertEquals(expected, service.ButtonWale6());
    }

    @Test
    void buttonWale7() {
        int expected = 7;
        assertEquals(expected, service.ButtonWale7());
    }

    @Test
    void buttonWale8() {
        int expected = 8;
        assertEquals(expected, service.ButtonWale8());
    }

    @Test
    void buttonWale9() {
        int expected = 9;
        assertEquals(expected, service.ButtonWale9());
    }

    @Test
    void nextWale() {
        int[] currentWave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for ( int wale : currentWave ) {
            int expected = wale + 1;
            int[] Wave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int actual = service.NextWale(Wave);
            assertEquals(expected, actual);
        }
    }

    @Test
    void prefWale() {
        int[] currentWave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for ( int wale : currentWave ) {
            int expected = wale + 1;
            int[] wave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int actual = service.PrefWale (wave);
            assertEquals(expected, actual);

        }
    }

    @Test
    void buttonVolume0() {
        int expected = 0;
        assertEquals(expected, service.ButtonVolume0());
    }

    @Test
    void buttonVolume1() {
        int expected = 1;
        assertEquals(expected, service.ButtonVolume1());
    }

    @Test
    void buttonVolume2() {
        int expected = 2;
        assertEquals(expected, service.ButtonVolume2());
    }

    @Test
    void buttonVolume3() {
        int expected = 3;
        assertEquals(expected, service.ButtonVolume3());
    }

    @Test
    void buttonVolume() {
        int expected = 4;
        assertEquals(expected, service.ButtonVolume4());
    }

    @Test
    void buttonVolume5() {
        int expected = 5;
        assertEquals(expected, service.ButtonVolume5());
    }

    @Test
    void buttonVolume6() {
        int expected = 6;
        assertEquals(expected, service.ButtonVolume6());
    }

    @Test
    void buttonVolume7() {
        int expected = 7;
        assertEquals(expected, service.ButtonVolume7());
    }

    @Test
    void buttonVolume8() {
        int expected = 8;
        assertEquals(expected, service.ButtonVolume8());
    }

    @Test
    void buttonVolume9() {
        int expected = 9;
        assertEquals(expected, service.ButtonVolume9());
    }

    @Test
    void buttonVolume10() {
        int expected = 10;
        assertEquals(expected, service.ButtonVolume10());
    }


    @Test
    void nextVolume() {
        int[] currentVolume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for ( int volume : currentVolume ) {
            int expected = volume + 1;
            int[] Volume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int actual = service.NextVolume(Volume);
            assertEquals(expected, actual);
        }
    }

    @Test
    void prefVolume() {
        int[] currentVolume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for ( int volume : currentVolume ) {
            int expected = volume - 1;
            int[] Volume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int actual = service.PrefVolume(Volume);
            assertEquals(expected, actual);
        }
    }


}

