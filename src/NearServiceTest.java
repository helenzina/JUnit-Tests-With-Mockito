import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class NearServiceTest {

    LocationService locationService;
    NearService nearService;

    @Before
    public void setUp() {
        locationService= Mockito.mock(LocationService.class);
        nearService= new NearService(locationService);
    }

    @After
    public void tearDown() {
        locationService= null;
        nearService= null;
    }

    @Test
    public void testIsNearToFirstCase() {
        Mockito.when(locationService.getLocation()).thenReturn(new Location(0, 0));
        int actual= nearService.isNearTo(new Location(0, 0));
        assertEquals(1, actual);
    }

    @Test
    public void testIsNearToSecondCase() {
        Mockito.when(locationService.getLocation()).thenReturn(new Location(0, 0));
        int actual= nearService.isNearTo(new Location(10, 10));
        assertEquals(2, actual);
    }

    @Test
    public void testIsNearToThirdCase() {
        Mockito.when(locationService.getLocation()).thenReturn(new Location(0, 0));
        int actual= nearService.isNearTo(new Location(100, 100));
        assertEquals(3, actual);
    }
}