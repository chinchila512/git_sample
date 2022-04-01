package model;

import java.util.List;

import DAO.CovidDAO;

public class RegisterDailyLogic {

	public CovidList execute(SearchInput input) {

		CovidDAO dao = new CovidDAO();
		List<Covid> covidlist = dao.findByPrefecture(input);
		CovidList list = new CovidList(covidlist);

		return list;

	}

}
