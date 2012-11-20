package com.mlb.common.utils;

import java.security.MessageDigest;

import org.apache.log4j.Logger;


/**
 * This class can be used to generate a hash value of a String using SHA-256.
 * <p>
 * Please see {@link DigestTest#testDigest()} for an example of how to use this class.
 * <p>
 * This class is a wrapper around a MessageDigest object using SHA-256 and digesting to
 * hexadecimal characters, since that is easy to trasmit across the web.
 * 
 * @author Jeffrey Mezic, LBi Software Engineering
 */
public class Digest {
	/**
	 * There is a list of possible algorithms to be used here:<br>
	 * http://java.sun.com/j2se/1.4.2/docs/guide/security/CryptoSpec.html#AppA 
	 */
    final Logger logger = Logger.getLogger(getClass());

	protected static final String ALGORITHM = "SHA-256";
	private String key = "" ;
	
	/**
	 * We utilize the MessageDigest class from the Java API.
	 */
	private MessageDigest md = null;
	
	public Digest(String key) {
		try {
			this.key = key ;
			md = MessageDigest.getInstance(ALGORITHM);
		} catch (Exception e) {
			logger.error("Error [Digest]: "+e.getMessage(),e);
			md = null;
		}
	}
	
	/**
	 * @return a digest of the given message using SHA-256, or the empty string if something fails
	 */
	public String digest(String message) {
		message = message + key ;
		if (md == null) {
			return "";
		} else {
			md.update(message.getBytes());
			return toHex(md.digest());
		}
	}

	/**
	 * @return the hexadecimal string represented by the given byte array
	 */
	private String toHex(byte data[]) {
		//each byte is represented by two hex characters
		StringBuffer hexString = new StringBuffer(data.length*2);
		
		for (int i = 0; i < data.length; i++) {
			byte b = data[i];
			hexString.append(toHex(b));
		}
		return hexString.toString();
	}
	
	/**
	 * A byte is 8 bits.
	 * <br>A hex character is 4 bits. 
	 * <br>Hence a byte can be represented by two hex characters.
	 * @return 2 hex characters representing the given byte
	 */
	private String toHex(byte b) {
		return String.valueOf(firstHexChar(b)) + String.valueOf(secondHexChar(b));
	}
	
	/**A mapping from decimal numbers (0-15) to hex characters (0-f). */
	private static final char[] hex = {
		'0', '1', '2', '3', '4', '5', '6', '7',
		'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	
	/**
	 * @return the first hex char of the given byte
	 */
	private char firstHexChar(byte b) {
		//get the first 4 bits
		int first = (b & 0xf0) >> 4; //blanks out the last 4 bits then right shifts the byte 4 times
		char firstChar = hex[first];
		return firstChar;
	}
	
	/**
	 * @return the second hex char of the given byte
	 */
	private char secondHexChar(byte b) {
		//get the second 4 bits
		int second = b & 0x0f; //blanks out the first 4 bits, leaving the second 4 bits
		char secondChar = hex[second];
		return secondChar;
	}
}
