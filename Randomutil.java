import java.util.Randomutils;
class RandomutilS {
    

    public static void main(String a[]){
     
       
        System.out.println("Random number between 0 and 1 : " + Math.random());
        System.out.println("Random number between 0 and 1 : " + Math.random());
        System.out.println("Random integer between 0 and 10 : " 
          + getRandom(10));
        System.out.println("Random integer between 0 and 10 : " 
          + getRandom(10));
        System.out.println("Random value between 1 and 10 : " 
          + getRandomInteger(10, 1));
        System.out.println("Random value between 1 and 10 : " 
          + getRandomInteger(10, 1));
        System.out.println("Random number between 1 and 100 : " 
          + getRandomInteger(100, 1));
        System.out.println("Random number between 1 and 100 : " 
          + getRandomInteger(100, 1));
        System.out.println("Random value between 1000 and 9999 : " 
          + getRandomInteger(1000, 10000));
        System.out.println("Random value between 1000 and 9999 : " 
          + getRandomInteger(100, 10000));
    }
    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }
    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
   
   
   
}

