import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
    public void testSendMessageSuccess(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(true);
        boolean actual=messageService.sendMessage("someip","somemessage");
        assertTrue(actual);
    }

    @Test
    public void testSendMessageFailed(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(false);
        boolean actual=messageService.sendMessage("someip","somemessage");
        assertFalse(actual);
    }

    @Test(expected= Exception.class)
    public void testSendMessageFailedManyTimes(){
        Mockito.when(network.sendMessage("someip","somemessage")).thenReturn(false, false).thenThrow(Exception.class);
        boolean actual= messageService.sendMessage("someip","somemessage");
    }

    @After
    public void teardown(){
        network= null;
        messageService= null;
    }

}
