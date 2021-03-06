// Pow(x, 2)

class Main{
    
    static int pow(int x, int y){
        if(y == 0)
            return 1;
        else if(y%2 == 0)
            return pow(x, y/2) * pow(x, y/2);
        else
            return x * pow(x, y/2) * pow(x, y/2);
    }
    
    public static void main (String[] args) {
        
        int x = 2; int y = 3;
        System.out.println(pow(x,y));
    }
}