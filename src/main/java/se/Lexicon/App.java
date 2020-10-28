package se.Lexicon;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Create a class called Car. The class should contain the following
        //information. Car brand, registration number, max speed and owner
        //name. Instantiate an Object of the class and assign values to the
        //object.

        class Car {
            String carBrand;
            String regNr;
            int maxSpeed;
            String ownerName;

            public String getInformation() {

                return "Bilmodellen är en " + carBrand + " " +
                        "med registreringsnummer " + regNr + "." +
                        " Bilen går jättefort, hela: " +
                        maxSpeed + "Kmh" + "." +
                        " Kul för dig " + ownerName + "!";
            }
        }

        Car car1 = new Car();

        car1.carBrand = "Volvo";
        car1.regNr = "ABC 123";
        car1.maxSpeed = 100;
        car1.ownerName = "Jan";

        System.out.println(car1.getInformation());



    }





    }



