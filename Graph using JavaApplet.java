 import java.applet.*;
    import java.awt.*;


                public class hw0125 extends Applet {

                   public void paint(Graphics g) {

        int newx,newy; // variables for x and y coordinates
                     int k=0;       // flag variable
                     int i=20;      // for incrementing the size of the lines
                     int w = getSize().width ; // width of the graphic space
        int h = getSize().height ;// height of the graphic space
        g.drawLine(w/2,h/2,w/2,h/2-10) ; //line
        g.drawLine(w/2,h/2-10,w/2-10,h/2-10) ;//line

                     int x=w/2-10; // x-coordinates
                     int y=h/2-10; // y-coordinates

                    do{

                                                   if(k==0)   //k is used as a flag to know when to decrement the value
                                        newy = y+i;  //height and when to increment it.
                                      else
                                        newy = y-i;



                                                  if(((h)-(newy-i) <5))
                                                    {g.drawLine(x,y,x,newy+10) ;
                                                     break;}
                                                  if(((h)-(newy+i) <5))
                                                    {g.drawLine(x,y,x,newy-10) ;
                                                     break;}

                                                  if(((h)-newy >=5)&&((w)-x>=5)&&(x>=5)&&(newy>=5)) 
                                                     g.drawLine(x,y,x,newy) ;
                                     else
                                                     break;


                                    if(k==0)    //k is the flag.
                                      newx=x+i;   //incrementing the width 
                                    else
                                      newx=x-i;   //decrementing the width



                                    if(((w)-(newx-i) <5))
                                                   { g.drawLine(x,newy,newx+10,newy) ;
                                                     break; }
                                    if(((w)-(newx+i) <5))
                                                  { g.drawLine(x,newy,newx-10,newy) ;
                                                     break;}

                                    if(((w)-newx>=5)&&((h)-newy>=5)&&(newx>=5)&&(newy>=5))
                                                        g.drawLine(x,newy,newx,newy) ;
                       else
                                                     break;

                                    if(k==0)  //each time the flag k is changed to it's opposite value
                                                   k=1;    //we need to increment once and then to decrement
                                    else
                                                   k=0;


                       x=newx;  //storing the new x-coordinates
                                    y=newy;  //storing the old x-coordinates
                                    i=i+10;

                                  }while(i!=10); //dummy case


                 }
}
