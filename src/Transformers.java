public class Transformers implements Movable {

    @Override
    public void stepOne() {
        System.out.println("Stepping one");
    }

    @Override
    public boolean run(String where) {
        System.out.println("running to: " + where);
        return  false;
    }

    @Override
    public void layDown() {
        System.out.println("layDown");
    }
}
