// Generated by Scapix Language Bridge
// https://www.scapix.com

package com.scapix.chat;

public class ExtendedContact extends Contact
{
	public ExtendedContact(java.lang.String id, java.lang.String name) { super(nop); _init(id, name); }
	public ExtendedContact(int p1) { super(nop); _init(p1); }
	public ExtendedContact() { super(nop); _init(); }

	public native void test(java.lang.String p1, Contact p2, ExtendedContact p3);

	private native void _init(java.lang.String id, java.lang.String name);
	private native void _init(int p1);
	private native void _init();
	protected ExtendedContact(Nop nop) { super(nop); }
	static { System.loadLibrary("chatlib"); }
}

class ExtendedContact2 extends ExtendedContact
{
	public ExtendedContact2() { super(nop); _init(); }

	public native void test();

	private native void _init();
	protected ExtendedContact2(Nop nop) { super(nop); }
	static { System.loadLibrary("chatlib"); }
}

class ExtendedContact3 extends Contact
{
	public ExtendedContact3() { super(nop); _init(); }

	public native void test();

	private native void _init();
	protected ExtendedContact3(Nop nop) { super(nop); }
	static { System.loadLibrary("chatlib"); }
}
