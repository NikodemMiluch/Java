package Acme.Crypto;
import java.io.*;
public class CbcBlockCipher extends BlockCipher
    {

    private BlockCipher blockCipher;
    private byte[] iv;
    private byte[] temp;

    /// Constructor.
    public CbcBlockCipher( BlockCipher blockCipher )
	{
	super( blockCipher.keySize(), blockCipher.blockSize() );
	this.blockCipher = blockCipher;
	iv = new byte[blockSize()];
	zeroBlock( iv );
	temp = new byte[blockSize()];
	}


    // Key routines.

    // Set the key.
    public void setKey( byte[] key )
	{
	blockCipher.setKey( key );
	}
    

    // IV routines.

    /// Set the Initialization Vector.
    public void setIv( byte[] iv )
	{
	copyBlock( iv, this.iv );
	}
    
    /// Set and return a random IV.
    // In CBC mode, the IV does not have to be kept secret.
    // Typical usage is for the caller to set a random IV and then transmit
    // it as the first block of the message.
    public byte[] setRandomIv()
	{
	byte[] riv = new byte[blockSize()];
	randomBlock( riv );
	setIv( riv );
	return riv;
	}


    // Block encryption routines.

    /// Encrypt a block of bytes.
    public void encrypt( byte[] clearText, int clearOff, byte[] cipherText, int cipherOff )
	{
	xorBlock( clearText, clearOff, iv, 0, temp, 0, blockSize );
	blockCipher.encrypt( temp, 0, cipherText, cipherOff );
	copyBlock( cipherText, cipherOff, iv, 0, blockSize );
	}

    /// Decrypt a block of bytes.
    public void decrypt( byte[] cipherText, int cipherOff, byte[] clearText, int clearOff )
	{
	blockCipher.decrypt( cipherText, cipherOff, temp, 0 );
	xorBlock( temp, 0, iv, 0, clearText, clearOff, blockSize );
	copyBlock( cipherText, cipherOff, iv, 0, blockSize );
	}

    }
