package model;

import java.util.List;

import DAO.CovidDAO;

public class RegisterMonthlyLogic {
	public List<Covid> execute(SearchMonthlyInput input){
		CovidDAO dao=new CovidDAO();
		List<Covid> covidlist =dao.findByPrefecture(input);
		return covidlist;
			
		}
}
