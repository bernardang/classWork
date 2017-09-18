package classWork1;


import java.awt.Image;
import java.io.*;



public class ImageMessage implements Serializable {

 

    protected static final long serialVersionUID = 1112122200L;

 

    // The different types of message sent by the Client

    // WHOISIN to receive the list of the users connected

    // MESSAGE an ordinary message

    // LOGOUT to disconnect from the Server
    
    // IMAGE to send image

    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2 ,IMAGE= 3;

    private int type;

    private Image im;

     

    // constructor

  ImageMessage(int type, Image im) {

        this.type = type;

        this.im = im;

    }

     

    // getters

  int getType() {

        return type;

    }

    Image getImage() {

        return im;

    }

}