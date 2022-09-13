public interface A {
    public default void a(){
        x();
    };

    private void x(){
        System.out.println("x");
    }
}
