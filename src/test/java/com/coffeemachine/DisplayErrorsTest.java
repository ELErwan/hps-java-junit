package com.coffeemachine;

import junit.framework.TestCase;

public class DisplayErrorsTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    protected void setUp() throws Exception {
        super.setUp();

        // Given I handle coffee grounds
        actionwords.iHandleCoffeeGrounds();
        // And I handle water tank
        actionwords.iHandleWaterTank();
        // And I handle beans
        actionwords.iHandleBeans();
    }


    public void testDescalingIsNeededAfter500Coffees() {
    }
}