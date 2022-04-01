package model;

import java.util.List;

import DAO.CovidDAO;
 
public class RegisterCovidLogic {

//	public static void main(String []args) {
	public List<Covid> execute(SearchInput input){
	CovidDAO dao=new CovidDAO();
	List<Covid> covidlist =dao.findByPrefecture(input);
	return covidlist;
		
	}
	
}
