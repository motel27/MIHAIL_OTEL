package homework_nr_10;

class ElephantHerbivore extends  Erbivor{

    private String name;

    public ElephantHerbivore(String name) {
        this.name = name;
    }

    @Override
    public void families() {
        System.out.println(name + " is from family of the class of mammals from the order Proboscidea.");


        }

}
