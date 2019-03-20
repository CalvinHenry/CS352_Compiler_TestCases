
class p_mainClass {

    public static void main(String[] args){
        System.out.println(new fakeMain().run());
    }
}

class fakeMain {
    public int run(){
        Car a;

        Truck b;
        Vehicle v;
        int ret;
        a = new Car();
        b = new Truck();
        v = a;
        ret = a.makeCar(4);
        ret = b.makeTruck(10);
        ret = this.race(a, b);
        return 0;

    }

    public int race(Vehicle a, Vehicle b){
        int distA;
        int distB;

        distA = 0;
        distB = 0;
        while(distA < 100 && distB < 100){
            distA = distA + a.move();
            distB = distB + b.move();
        }
        if(distA > distB){
            System.out.println("Vehicle A wins!");
        }else if(distA < distB){
            System.out.println("Vehicle B wins!");
        }else {
            System.out.println("Its a tie!");
        }
        return 0;
            
    }
}

class Vehicle {
    int moveSpeed;

    public int create(int speed){
        moveSpeed = speed;
        return 0;
    }

    public int move(){
        System.out.print("Zoom zoom, I went ");
        System.out.print(moveSpeed);
        System.out.println(" Units!");
        return moveSpeed;
    }

    
}

class Car extends Vehicle{
    int people;

    public int makeCar(int speed){
        moveSpeed = speed * 2; 
        people = 1;
        return 0;
    }
}

class Truck extends Vehicle {

    public int makeTruck(int speed){
        moveSpeed = speed - 5;
        return 0;
    }
}

