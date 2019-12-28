package day54_Polymorphism;

interface InterFace {
    
    abstract void get();
    
}
interface InterFace2 extends InterFace{
    
    abstract void frame();
    
}
abstract class AbsClass{
    
}
public class Test2 extends AbsClass implements InterFace, InterFace2 {
    
    public static void main(String[] args) {
        InterFace obj = new Test2();
        obj.get();  // chrome
        
        InterFace2 obj2 = new Test2();
                    obj2.frame();  // frame
                    obj2.get();
                    
        AbsClass obj3 = new Test2();
        
        
    }
    @Override
    public void get() {
        System.out.println("Chrome browser"); 
    }
    @Override
    public void frame() {
        System.out.println("frame");
        
    }
    
    
}
