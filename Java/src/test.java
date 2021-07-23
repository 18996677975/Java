import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class test {

//    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
//
//    // 数据库的用户名与密码，需要根据自己的设置
//    static final String USER = "root";
//    static final String PASS = "1031";

    public static void main(String[] args) {

        String test = "application_1621617569008_0002";
        System.out.println(test.substring(test.indexOf('_')));
        System.out.println(test.substring(test.indexOf('_')+1, test.lastIndexOf('_')));
        System.out.println(Long.parseLong(test.substring(test.indexOf('_')+1, test.lastIndexOf('_'))));

        String t = "6650211";

        System.out.println(Integer.parseInt(t));
//        Long.parseLong()

//        HashMap<String, Integer> test = new HashMap<>();
//
//        test.put("1", 1);
//        test.put("2", 2);
//        test.put("3", 3);
//        test.put("4", 4);
//        test.put("5", 5);
//
//        System.out.println(test.size());

//        Connection conn = null;
//        Statement stmt = null;
//        try{
//            // 注册 JDBC 驱动
//            Class.forName(JDBC_DRIVER);
//
//            // 打开链接
//            System.out.println("连接数据库...");
//            conn = DriverManager.getConnection(DB_URL,USER,PASS);
//
//            // 执行查询
//            System.out.println(" 实例化Statement对象...");
//            stmt = conn.createStatement();
//            String sql;
//            sql = "select exec_id, project_id, flow_id, job_id, attempt, start_time, end_time, status, input_params from execution_jobs where replace(unix_timestamp(current_timestamp(3)), '.', '') - 300000 > start_time";
//            ResultSet rs = stmt.executeQuery(sql);
//
//            // 展开结果集数据库
//            while(rs.next()){
//                // 通过字段检索
//                int id  = rs.getInt("exec_id");
//
//                // 输出数据
//                System.out.print("ID: " + id);
//            }
//            // 完成后关闭
//            rs.close();
//            stmt.close();
//            conn.close();
//        }catch(SQLException se){
//            // 处理 JDBC 错误
//            se.printStackTrace();
//        }catch(Exception e){
//            // 处理 Class.forName 错误
//            e.printStackTrace();
//        }finally{
//            // 关闭资源
//            try{
//                if(stmt!=null) stmt.close();
//            }catch(SQLException se2){
//            }// 什么都不做
//            try{
//                if(conn!=null) conn.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }
//        }
//        System.out.println("Goodbye!");
    }
}
