package com.bibisco.dao.client;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bibisco.dao.model.VCharacterScene;
import com.bibisco.dao.model.VCharacterSceneExample;

public interface VCharacterSceneMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int countByExample(VCharacterSceneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int deleteByExample(VCharacterSceneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int insert(VCharacterScene record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int insertSelective(VCharacterScene record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	List<VCharacterScene> selectByExample(VCharacterSceneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int updateByExampleSelective(@Param("record") VCharacterScene record, @Param("example") VCharacterSceneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHARACTER_SCENE
	 * @mbggenerated  Fri Nov 15 08:46:22 CET 2013
	 */
	int updateByExample(@Param("record") VCharacterScene record, @Param("example") VCharacterSceneExample example);
}