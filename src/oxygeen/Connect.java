
package oxygeen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Connect {
     Connection         con = null;
     PreparedStatement  pst = null;
     ResultSet          res = null;

    public static Connection connect(){
  
     try{
         Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/oxygen","root","");
       
         //JOptionPane.showMessageDialog(null, "connected");
        // con.close();
         return con;
             
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }

}
    
     
        public static void main(String[] args) {
       
            Connect.connect();
    }
 
        
       /* public int getMax(String columname,String tablename){
        
          String sql="select max("+columname+")from"+tablename+"";
          int max=0;
          try{
               pst=con.prepareStatement(sql);
               res=pst.executeQuery();
               if(res.next()){
                max=res.getInt(1);
               }
               return max+1;
          }catch(Exception e){
               return -1;
          }
        }*/
}
