class student{
    private String name;
    private String weight;
    private String cm;
    private String address;
    private String looks;

    public student(){
        System.out.println("object is created");
    }

    public void setstudent(String name,String weight,String cm,String address,String looks){
        this.name = name;
        this.weight = weight;
        this.cm = cm;
        this.address = address;
        this.looks = looks;
    }
    public void getstudent(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(cm);
        System.out.println(address);
        System.out.println(looks);
    }    
    
}