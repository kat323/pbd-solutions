public class VariablesAndNames {
    public static void main (String[] args) {

        //these two lines declare names that will attach to different variables. 
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInACar, carpoolCapacity, averagePassengersPerCar;

        //these lines declare the values of those variables.
        //there are 100 cars 
        cars = 100;
        //this a value used as part of a formula to determine the carpool capacity. 
        spaceInACar = 4.0;
        //there are 30 drivers.
        drivers = 30;
        //there are 90 passengers. 
        passengers = 90;
        //this variable computes the number of cars substracted by drivers.
        carsNotDriven = cars - drivers;
        //this variable calls the number of drivers. 
        carsDriven = drivers;
        //this variable multiplies the amount of cars driven and the space in an individual car. 
        carpoolCapacity = carsCriven * spaceInACar;
        //this variable divides the amount of passengers divided the amount of cars being driven. 
        averagePassengersPerCar = passengers / carsDriven;

        //these lines return strings with the variables that are declared. 
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + carsNotDriven + " empty cars today." );
        System.out.println( "We can transport " + carpoolCapacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + averagePassengersPerCar + " in each car." );
        
    }
}


//1. It is necessary because it is not an integer. 
//2. A floating number means that it has decimal values. 
//3. Done above 
//4. = means that it's making names for things. 
//5. _ is a character. Use camel instead
