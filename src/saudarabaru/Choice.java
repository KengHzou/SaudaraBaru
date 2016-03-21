/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;

/**
 *
 * @author KengHzou
 */
public class Choice {
        static void SwitchGender(profile np,String B){
            switch (B)
                          {case "F":
                              np.setgender("Female");
                              break;
                          case "M":
                              np.setgender("Male");
                              break;
                          default:
                              break;
}
}
        static void SwitchStatus(profile np,String B){
            switch (B)
                          {case "Single":
                              np.setgender("Single");
                              break;
                          case "Married":
                              np.setgender("Married");
                              break;
                          default:
                              break;
}
}












}