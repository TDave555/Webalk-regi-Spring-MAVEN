package hu.iit.me.webalk.db.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;

import hu.iit.me.webalk.db.service.People;

public class PeopleDto {
	private Long id;
    @NotEmpty
    private String name;
    @Min(18)
    private int age;


	public PeopleDto() {
	}
	
	public PeopleDto(People people) {
		this.id = people.getId();
		this.age = people.getAge();
		this.name = people.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public People toEntity(){
        return new People(id, age, name);
    }
	
}
