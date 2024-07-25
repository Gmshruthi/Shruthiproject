public class Vehicle {
        private String brand;
        protected int year;
        public String model;
        int speed;
        private void startEngine()
        {
            System.out.println("Engine Started");
        }
        protected void accelerate()
        {
            System.out.println("Accelearting");
        }
        public void stop()
        {
            System.out.println("vehicle stopped");
        }
        void currentSpeed(){
            System.out.println("current speed");
        }

    }
    class car extends Vehicle{
        public static void main(String args[])
    {
        Vehicle car=new Vehicle();
        car.accelerate();
        car.currentSpeed();
        car.stop();
        //car.startEngine();
        System.out.println(car.model);
        //System.out.println(car.brand);
        System.out.println(car.speed);
        System.out.println(car.year);


    }

    }
    class main{
            public static void main(String args[])
            {
                Vehicle car=new Vehicle();
                car.accelerate();
                car.currentSpeed();
                car.stop();
               // car.startEngine();
                System.out.println(car.model);
               // System.out.println(car.brand);
                System.out.println(car.speed);
                System.out.println(car.year);


            }
        }





