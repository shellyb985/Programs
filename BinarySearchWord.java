/**
  *purpose
  *Binary Search the Word from Word List
**/
import java.util.Scanner;
import java.util.ArrayList;
public class BinarySearchWord{

  public static void main(String []args){
    String listWord=new String(); //to store inpt string
    int strlen;//to store string length
    //ArrayList<String> strList=new ArrayList<String>(5); //to store list of word s
    String[] word=new String[20];
    String searchWord=new String();
    int count=0; //to store number of word
    Scanner scan=new Scanner(System.in);

    System.out.print("Enter the word lis seperated by comma : ");
    listWord=scan.next();

    System.out.print("Enter the word to search : ");
    searchWord=scan.next();
    strlen=listWord.length();
    //Loop for seperating word from string
    for(String tstring : listWord.split(",")){
      word[count++]=tstring;
    }//End of for loop
    word=wordSort(word,count);
    //Printing sorted array
    for(int i=0;i<count;i++){
      System.out.print(word[i]+" ");
    }
    System.out.println("");
    //Searching the word
    binarySearch(word,searchWord,0,count);
  }//End of Main method

//Method to sort word
  public static String[] wordSort(String[] wordString,int count){
    //loop for sorting
    for(int i=0;i<count;i++){
      //String tSting=word[i];
      for(int j=0;j<count && j!=i;j++){
        int check=wordString[i].compareTo(wordString[j]);
        //swap
        if(check<0){
          String tString=wordString[i];
          wordString[i]=wordString[j];
          wordString[j]=tString;
      }
    }//End of loop j
  }//End of loop i
  return wordString;
}//End of method

//binary search method
public static void binarySearch(String[] word,String searchWord,int low,int up){
  if(low>up){
    System.out.println("Not found");
    return ;
  }
  String midWord; //to store middle word
  int mid=(low+up)/2;
  int check=searchWord.compareTo(word[mid]);
  if(check==0){
    System.out.println("Word Found");
    return ;
  }
  else if(check<0){
    up=mid-1;
    binarySearch(word,searchWord,low,up);
  }
  else{
    low=mid+1;
    binarySearch(word,searchWord,low,up);
  }

}//End of method
}//End of class
