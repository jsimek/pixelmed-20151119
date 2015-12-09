/* Copyright (c) 2001-2015, David A. Clunie DBA Pixelmed Publishing. All rights reserved. */

package com.pixelmed.test;

import com.pixelmed.dose.*;

import junit.framework.*;

public class TestAttributeList_AllTests extends TestCase {
	
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit Tests");
		suite.addTest(TestUnknownSequenceValueRepresentation.suite());
		suite.addTest(TestPrivateCreatorValueRepresentation.suite());
		suite.addTest(TestAttributeListReadTerminationStrategy.suite());
		suite.addTest(TestDecompressedImagePixelModuleAndLossyImageCompressionHistory.suite());
		return suite;
	}
	
}