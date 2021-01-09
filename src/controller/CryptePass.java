package controller;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class CryptePass {

	public CryptePass() {
		// TODO Auto-generated constructor stub
	}
	
	public String encrypt(String password, String key){
		try{
			Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, clef);
			return  new String(cipher.doFinal(password.getBytes()));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error de cryptage \n"+e);
			return null;
			
		}
		
	}
	
	public String decrypt(String password, String key){
		try{
			Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, clef);
			return new String(cipher.doFinal(password.getBytes()));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erreur de decryptage "+e);
			return null;
		}
	}

}
