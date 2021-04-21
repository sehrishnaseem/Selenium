public class Samsung extends Smart_Phone {
    @Override
    public void call(){
        super.call();
        System.out.println("I am calling child function");
    }

    public void call (String abc){
        System.out.println("Can a call is recorded?" + abc);

    }
}
