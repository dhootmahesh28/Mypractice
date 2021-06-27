//Child Class
//Child class calling methods from Parent class (applyBreak, speedUp) = Inheritance
package Inheritance;

    public class MountainBike extends Bicycle {

        // the MountainBike subclass adds one more field
        public int seatHeight;
        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                            int startHeight) {
            // invoking base-class(Bicycle) constructor
            super(gear, speed);
            seatHeight = startHeight;
        }
        // the MountainBike subclass adds one more method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
        // overriding toString() method
        // of Bicycle to print more info
        @Override
        public String toString() {
            return (super.toString() +
                    "\n seat height is " + seatHeight);
        }


        public static void main(String args[]) {

            MountainBike mb = new MountainBike(3, 100, 25);
            //System.out.println(mb.toString());
            mb.applyBrake(20);
            mb.speedUp(40);
            mb.gear = 5;

        }
    }
