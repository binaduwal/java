public class Arrayjoin {
    public static void main(String[] args) {
        String [] firstname={"Bina","Khusi","Laxmi","Shukrina","Sajina","Rita"};
        String [] lastname={"Duwal","Chaudhary","Shrestha","Koju","Yonjan","khadka"};
        String [] joinedArray=joinArrays(firstname,lastname);
                for(String name:joinedArray){
                    System.out.println(name+" ");
                }
            }

            public static String[] joinArrays(String [] firstname,String [] lastname){
        int length1=firstname.length;
        int length2=lastname.length;
        String[] result=new String[length1+length2];
        for(int i=0;i<length1;i++)
        {
            result[i]=firstname[i];

        }
        for(int i=0;i<length2;i++)
        {
            result[length1+i]=lastname[i];
        }
            return result;
    }

}
