class book{
    private String name;
    private String title;
    private String page;
    private String person;
    private String major;

    public book(){
        System.out.println("object is created");
    }

    public void setbook(String name,String title,String page,String person,String major){
        this.name = name;
        this.title = title;
        this.page = page;
        this.person = person;
        this.major = major;
    }
    public void getbook(){
        System.out.println(name);
        System.out.println(title);
        System.out.println(page);
        System.out.println(person);
        System.out.println(major);
    }    
    
}