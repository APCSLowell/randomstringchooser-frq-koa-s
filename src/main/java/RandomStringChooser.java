import java.util.*;
public class RandomStringChooser
{
  private String[] list;
  private ArrayList<String> aList;
  public RandomStringChooser(String[] sString)
  {
    aList = new ArrayList<String>();
    for(int i = 0; i<list.length(); i++)
      {
        aList.add(list[i]);
      }
  }
  public String getNext()
  {
    if(aList.size()==0)
    {
      return "NONE";
    }
    int num = (int)(Math.random()*aList.size());
    String sString = aList.get(num);
    aList.remove(num);
      return sString;
  }
  
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
