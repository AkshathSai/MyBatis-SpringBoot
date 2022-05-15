package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.AlertCustomization;

@Mapper
public interface AlertDataInterfaceMapper {

	@Select("SELECT FEATURENAME, FEATUREFLAG FROM ALERTFEATUREFLAGS WHERE MSTALERTID=#{alertId}")
	List<AlertCustomization> getMasterAlertSpecificCustomization(@Param("alertId") String alertId);
	
}
