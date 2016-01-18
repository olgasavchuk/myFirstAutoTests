package com.chap005;

import com.domainobject.TestAppEnv;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        assertEquals("Return Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainStatically() {
        assertEquals("Return Hard Coded Domain", "192.123.0.3", TestAppEnv.DOMAIN);
    }

    @Test
    public void canGetPortStatically() {
        assertEquals("Return Hard Coded Port", "67", TestAppEnv.PORT);
    }
}

// the same class BUT with difference in import and class fields usage


/*
package com.chap005;

import static com.domainobject.TestAppEnv.*;
import org.junit.Assert;
import org.junit.Test;


public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Return Hard Coded URL", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainStatically() {
        Assert.assertEquals("Return Hard Coded Domain", "192.123.0.3", DOMAIN);
    }

    @Test
    public void canGetPortStatically() {
        Assert.assertEquals("Return Hard Coded Port", "67", PORT);
    }
}
 */