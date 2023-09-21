package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RetryConfigMapper {

    @Select("SELECT DOMAINVAL FROM MST_DOMAINS WHERE DOMAINNAME='D_RETRYATTEMPTS'")
    String getRetryAttempts();

    @Select("SELECT DOMAINVAL FROM MST_DOMAINS WHERE DOMAINNAME='D_TIMETOWAIT'")
    String getTimeToWait();

}

