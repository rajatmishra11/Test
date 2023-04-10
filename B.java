interface Drawable{
    void draw();
}

class A implements Drawable{
    public void draw(){
        System.out.println("Hello");
    }
}

class B implements Drawable{
    public void draw(){
        System.out.println("Hi");
    }

    public static void main(String args[]){
       Drawable d = new A();
       d.draw(); 
    }

}
