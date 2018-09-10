package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Resource;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月9日 下午9:57:19 
  * @version：   1.0.0
  * @describe:    
  */
public interface ResourceDao {
	
	@Select("<script>select * from res where status='1' and res_type='menu' and parent_id <if test='parentId==null'>is null</if><if test='parentId!=null'>=#{parentId}</if> order by show_seq</script>")
	List<Resource> getMenu(@Param("parentId")String parentId);
}
