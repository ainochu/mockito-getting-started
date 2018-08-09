package com.andreain.mockitoexample;

import com.andreain.mockitoexample.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Map;

import static org.mockito.Mockito.when;

/**
 * This class simulate a normal test usign Mockito decorators.
 *
 * @author andreain
 * @see MockitoJUnitRunner
 * @see InjectMocks
 * @see Mock
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    @InjectMocks
    private User user;

    @Mock
    private Map<String, String> roles;

    @Test
    public void testUserMockInjected() {
        //Put method
        roles.put("ADMIN_ROLE", "user_1");
        user.setRole("MEDIUM_ROLE", "user_2");
        Assert.assertEquals(roles.get("ADMIN_ROLE"), user.getRole("ADMIN_ROLE"));

        //Get method
        when(user.getRole("ADMIN_ROLE")).thenReturn("user_1");
        Assert.assertEquals("user_1", roles.get("ADMIN_ROLE"));
    }

}
