class Second{
    public static void main(String[] args){
        // create an object of the student class (which inherits attributes from and methods from Main)
        Student myObj= new Student();

        System.out.println(myObj.fname);
        System.out.println(myObj.age);
        System.out.println(myObj.graduationYear);

        myObj.study(); //abstract method
    }
}