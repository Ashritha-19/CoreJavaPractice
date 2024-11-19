package avootaabstract;

public abstract class AvootaWithAngular implements Website {

    @Override
    public void header() {
        System.out.println("from header");
    }

    @Override
    public void footer() {

    }

    public abstract void body();

    public String page(){
        header();
        body();
        footer();
        return this.getClass().getName();
    }

}
