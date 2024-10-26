package day06_a_arithmetic_operators;

public class House {

    public static void main(String[] args) {

        String houseType = "Single house", basement = "NO", attic = "YES", pool = "YES", forSale = "YES", address = "13309 Beebe Aly, Orlando, FL 32827", parkNearby = "YES", school = "Nearby school ratings:";
        int bedrooms = 3, bathrooms = 2, kitchen = 1, cost = 650000, high = 7, middle = 8, elementary = 9;


        String result = "\"Request a tour.\"\n\n\t" + "House type:\t\t\t\t\t" + houseType + "\n\tNumbers of bedrooms:\t\t" + bedrooms + "\n\tNumbers of bathrooms:\t\t" + bathrooms + "\n\tNumbers of kithens:\t\t\t" + kitchen + "\n\tBasement:\t\t\t\t\t" + basement + "\n\tAttic:\t\t\t\t\t\t" + attic +  "\n\tPool:\t\t\t\t\t\t" + pool + "\n\tIs th house for sale?:\t\t" + forSale +"\n\tCost of house:\t\t\t\t$" + cost + "\n\tAddress, zipcode:\t\t\t" +address + "\n\tIs a park nearby?:\t\t\t" + parkNearby + "\n\t\t" + school + "\n\t\t\t\t-High:\t\t\t" + high + "\n\t\t\t\t-Middle:\t\t" + middle + "\n\t\t\t\t-Elementary:\t" + elementary;

        System.out.println(result);


        //package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */


                // We can declare same datatype variables in ONE statement
                //String houseType, address;
                houseType = "Single House";
                address = "123 Test Dr, Fairfax, VA";

                // We can declare and initialize (give the initial value) same datatype variables in ONE statement
                int numOfBedroom = 5, numOfKitchen = 2, zipCode = 12345;

                double numOfBathroom = 2.5;
                double costOfHouse = 999_999.99; //999,999.99
                double schoolRatings = 4.75;

                boolean hasBasement = true;
                boolean hasAttic = false;
                boolean hasPool = true;
                boolean isForSale = true;
                boolean hasNearByPark = false;

        /*
            I am looking for "$houseType" which is located in $address $zipCode. It has $numOfBedroom bedroom and $numOfKitchen kitchen as well as $numOfBathroom bathroom. The cost of the house is $$costOfHouse.

            The house has the following additional info:
                School Ratings:     $schoolRatings
                Has Basement:       $hasBasement
                Has Attic:          $hasAttic
                Has Pool:           $hasPool
                Is For Sale:        $isForSale
                Has nearby Park:   $hasNearByPark
         */

                //String result = "I am looking for \"" + houseType + "\" which is located in " + address + ", " +zipCode + ". \nIt has " + numOfBedroom + " bedroom and " + numOfKitchen + " kitchen as well as " + numOfBathroom + " bathroom. \nThe cost of the house is $" + costOfHouse + ".\n\nThe house has the following additional info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement:\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" + hasAttic + "\n\tHas Pool:\t\t\t" + hasPool + "\n\tIs For Sale:\t\t" + isForSale + "\n\tHas nearby Park:\t" + hasNearByPark;

                System.out.println(result);
                System.out.println();
                // Benefit of re-using the variables is that we do not write whole code again and again.
                System.out.println(result);
                System.out.println();
                System.out.println("I am looking for \"" + houseType + "\" which is located in " + address + ", " +zipCode + ". \nIt has " + numOfBedroom + " bedroom and " + numOfKitchen + " kitchen as well as " + numOfBathroom + " bathroom. \nThe cost of the house is $" + costOfHouse + ".\n\nThe house has the following additional info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement:\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" + hasAttic + "\n\tHas Pool:\t\t\t" + hasPool + "\n\tIs For Sale:\t\t" + isForSale + "\n\tHas nearby Park:\t" + hasNearByPark);


            }

        }


