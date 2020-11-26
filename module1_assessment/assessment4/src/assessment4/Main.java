/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment4;

/**
 *
 * @author Krisnicole
 */
class Main {
       public boolean endsNg(String str) 
{
  int len = str.length();
  String ng = "ng";
  if (len < 2)
    return false;
  else if (ng.equals(str.substring(len-2,len)))
    return true;
  else
    return false;
}
}
