package com.kshrd.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;


@Repository
public interface UserRepository {

	String R_USERS = "SELECT "
			+ "	U.user_id , "
			+ "	U.username , "
			+ "	U.password , "
			+ "	U.email , "
			+ "	R.role_id, "
			+ " R.role_name "
			+ "	FROM tblusers U "
			+ " INNER JOIN tblroles R ON U.role_id = R.role_id";
	
	
	@Select(R_USERS)
	@Results(value={
			@Result(property="id" , column="user_id"),
			@Result(property="username" , column="username"),
			@Result(property="password" , column="password"),
			@Result(property="role.id" , column="role_id"),
			@Result(property="role.roleName" , column="role_name")
	})
	public ArrayList<User> getUsers();
	

	String C_USER = "INSERT INTO tblusers(username , password, email, role_id) "
			+ " VALUES(#{username} , #{password} , #{email} , #{role.id})";
	@Insert(C_USER)
	public boolean addUser(User user);
	
	
	
	String U_USER = "UPDATE tblusers SET "
			+ "	username=#{username} , "
			+ "	email=#{email} , "
			+ "	password=#{password} "
			+ "WHERE "
			+ "	user_id=#{id}";
	@Update(U_USER)
	public boolean updateUser(User user);
	
	
	String D_USER = "DELETE FROM tblusers WHERE user_id=#{userId} and role_id=#{roleId}";
	@Delete(D_USER)
	public boolean deleteUser(@Param("userId") int userId , @Param("roleId")int roleId);
	
	
}
