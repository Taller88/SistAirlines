/**
 *<pre>
 * com.hr.cmn
 * Class Name : JDBCResClose.java
 * Description : �ڿ��ݳ�(Connection,PreparedStatement,ResultSet)
 * Modification Information
 * 
 *   ������      ������              ��������
 *  ---------   ---------   -------------------------------
 *  2020-02-04           ���ʻ���
 *
 * @author ���������ӿ�ũ ����ȯ�� ������
 * @since 2020-02-04 
 * @version 1.0
 * 
 *
 *  Copyright (C) by H.R. KIM All right reserved.
 * </pre>
 */
 
package com.hr.cmn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import scheduleDTO.ScheduleDAO;

/**
 * @author sist
 *
 */
public class JDBCResClose {
   private final static Logger LOG = 
         Logger.getLogger(JDBCResClose.class);
   
   /**
    * 
    *@Method Name:rollBack
    *@�ۼ���: 2020. 2. 4.
    *@�ۼ���: sist
    *@����: rollback
    *@param Connection
    */
   public static void rollBack(Connection conn) {
         try {
            conn.rollback();
         } catch (SQLException e) {
            LOG.debug("======================");
            LOG.debug("=rollBack="+e.getMessage());
            LOG.debug("======================");
            e.printStackTrace();
         }
   }
   
   /**
    * 
    *@Method Name:close
    *@�ۼ���: 2020. 2. 4.
    *@�ۼ���: sist
    *@����: ResultSet �ڿ��ݳ�
    *@param rs
    */
   public static void close(ResultSet rs) {
      if(null !=rs) {
         try {
            rs.close();
         } catch (SQLException e) {
            LOG.debug("===================");
            LOG.debug("rs close="+e.getMessage());
            LOG.debug("===================");
            e.printStackTrace();
         }
      }
   }
   
   /**
    * 
    *@Method Name:close
    *@�ۼ���: 2020. 2. 4.
    *@�ۼ���: sist
    *@����: PreparedStatement �ڿ��ݳ�
    *@param pstmt
    */
   public static void close(PreparedStatement pstmt) {
      if(null !=pstmt) {
         try {
            pstmt.close();
         } catch (SQLException e) {
            LOG.debug("===================");
            LOG.debug("pstmt close="+e.getMessage());
            LOG.debug("===================");
            e.printStackTrace();
         }
      }
   }
   
   /**
    * 
    *@Method Name:close
    *@�ۼ���: 2020. 2. 4.
    *@�ۼ���: sist
    *@����: connection �ڿ��ݳ�
    *@param connection
    */
   public static void close(Connection connection) {
      if(null !=connection) {
         try {
            connection.close();
         } catch (SQLException e) {
            LOG.debug("===================");
            LOG.debug("connection close="+e.getMessage());
            LOG.debug("===================");
            e.printStackTrace();
         }
      }
   }
   
}











