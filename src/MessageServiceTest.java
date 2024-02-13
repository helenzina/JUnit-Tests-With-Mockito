import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doThrow;

public class MessageServiceTest{

    Network network;
    MessageService messageService;

    @Before
    public void setUp(){
        network= Mockito.mock(Network.class);
        messageService= new MessageService(network);
    }

    @Test
    public void testSendMessageSuccessFirstTry(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(true);
        boolean actual=messageService.sendMessage("someip","somemessage");
        assertTrue(actual);
    }

    @Test
    public void testSendMessageSuccessSecondTry(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(false, true);
        boolean actual=messageService.sendMessage("someip","somemessage");
        assertTrue(actual);
    }

    @Test
    public void testSendMessageFailedTwoTimes(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(false, false);
        boolean actual= messageService.sendMessage("someip","somemessage");
        assertFalse(actual);
    }

    @After
    public void teardown(){
        network= null;
        messageService= null;
    }

}
