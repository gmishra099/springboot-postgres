package com.example.demo.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Contact;
import com.example.demo.model.Individual;

public class ContactMapper implements RowMapper<Contact> {

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact = Contact.builder().contactId(rs.getString("contactId"))
				.firstName(rs.getString("firstName")).lastName(rs.getString("lastName"))
				.phone(rs.getString("phone")).SFID(rs.getString("SFID")).build();
		Individual individual = Individual.builder().SFID(rs.getString("SFID"))
				.hasOptedOut(rs.getString("hasOptedOut")).shouldForget(rs.getString("shouldForget")).build();
		contact.setIndividual(individual);
		return contact;
	}

}
