package com.example.kotlin_sample

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import kotliquery.Session
import kotliquery.sessionOf

class BaseRepository {
    companion object {

        private val dataSource by lazy {
            val hikariConfig : HikariConfig = HikariConfig();
            hikariConfig.jdbcUrl = "jdbc:mysql://localhost:3306/voic?userSSL=false";
            hikariConfig.username = "root";
            hikariConfig.password = "0000";
            hikariConfig.driverClassName = "com.mysql.jdbc.Driver"
            val dataSource : HikariDataSource = HikariDataSource(hikariConfig);

            dataSource;
        }

        @JvmStatic fun getSession(): Session {
            return sessionOf(dataSource);
        }
    }
}
