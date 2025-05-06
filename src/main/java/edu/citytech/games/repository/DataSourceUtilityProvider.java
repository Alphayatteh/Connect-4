package edu.citytech.games.repository;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceUtilityProvider {

    private final BasicDataSource dataSource;

    public DataSourceUtilityProvider(){

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl( "jdbc:derby://localhost:1527/data/thegames;user=gameUser;password=game1234");
        this.dataSource = dataSource;

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
