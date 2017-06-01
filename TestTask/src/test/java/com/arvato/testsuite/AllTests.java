package com.arvato.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.arvato.test.CRMTest;
import com.arvato.test.ContactTest;
import com.arvato.test.ITCentreTest;
import com.arvato.test.MainPageTest;
import com.arvato.test.OpenPositionsTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContactTest.class,
	CRMTest.class,
	ITCentreTest.class,
	MainPageTest.class,
	OpenPositionsTest.class
})
public class AllTests {}
