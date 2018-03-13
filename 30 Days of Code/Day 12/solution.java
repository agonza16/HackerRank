class Student extends Person{
	private int[] testScores;
    //private String firstName;
    //private String lastName;
    //private int iD;
  
    

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
   //public Student (String firstN, String lastN, int id, int[] tests)
    public Student(String firstN, String lastN, int id, int[] tests)
    {
        /*firstName = firstN;
        lastName = lastN;
        idNumber = id;
        */super(firstN,lastN,id);
        testScores = tests;
        
    }    
  
    // Write your method here
    
    public String calculate()
    {
        int total = 0;
        String grade = "";
       // System.out.println("calc");
        for (int count = 0; count < testScores.length; count++)
        {
            total += testScores[count];
        }
        
        total = total/testScores.length;
        
        if (total >= 90)
        {grade = "O";}    
        else if (total >= 80)
        {grade = "E";} 
       else if (total >= 70)
        {grade = "A";} 
        else if (total >= 55)
        {grade = "P";} 
       else if (total >= 40)
        {grade = "D";} 
        else
        {grade = "T";} 
        return grade;
    }    
}