package com.npage;

import com.npage.model._5_.DataAccessObject;
import com.npage.model._5_.MysqlDao;
import com.npage.model._5_.OracleDao;

public class _5_Interface {

    public static void main(String[] args) {
        polymorphism_example();
    }

    /**
     * 아래 주석된 dbWork 함수가 다음을 출력하도록 DataAccessObject 인터페이스와 OracleDao, MysqlDao 클래스 작성
     * 출력할 문자열 8개
     * Oracle DB select
     * Oracle DB insert
     * Oracle DB update
     * Oracle DB delete
     * Mysql DB select
     * Mysql DB insert
     * Mysql DB update
     * Mysql DB delete
     */
    public static void polymorphism_example() {
//        dbWork(new OracleDao());
//        dbWork(new MysqlDao());
    }

    private static void dbWork(DataAccessObject dao) {
//        dao.select();
//        dao.insert();
//        dao.update();
//        dao.delete();
    }
}
