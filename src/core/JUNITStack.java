package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        int size = s1.getSize();

        assertEquals(0, size);
        boolean empty = s1.isEmpty();
        assertTrue(empty);
	}
    
	public void testPushElmToTop() {
        Stack s1 = new Stack();
        s1.push(1);
        int size = s1.getSize();

        assertEquals(1, size);
        boolean empty = s1.isEmpty();
        assertFalse(empty);
	}
	
	public void testLastInFirstOut() {
		Stack s3 = new Stack();
		s3.push(0);
		s3.push(1);
		
	}

}
