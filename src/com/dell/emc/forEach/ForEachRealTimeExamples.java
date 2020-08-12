package com.dell.emc.forEach;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ForEachRealTimeExamples {

	public static void main(String[] args) {
        List < Entity > entities = getEntities();

        List < EntityDTO > dtos = new ArrayList < > ();
        entities.forEach(entity -> {
            dtos.add(new EntityDTO(entity.getId(), entity.getEntityName()));
        });

        dtos.forEach(e -> {
            System.out.println(e.getId());
            System.out.println(e.getEntityName());
        });

    }

	public static List<Entity> getEntities() {
		List<Entity> entities = new ArrayList<>();
		entities.add(new Entity(100, "entity 1"));
		entities.add(new Entity(100, "entity 2"));
		entities.add(new Entity(100, "entity 3"));
		return entities;
	}
}

class EntityDTO {
	private int id;
	private String entityName;
	private Date createdAt;
	private String createBy;
	private Date updatedAt;
	private String updatedBy;

	public EntityDTO(int id, String entityName) {
		this.id = id;
		this.entityName = entityName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}

class Entity {
	private int id;
	private String entityName;
	private Date createdAt;
	private String createBy;
	private Date updatedAt;
	private String updatedBy;

	public Entity(int id, String entityName) {
		super();
		this.id = id;
		this.entityName = entityName;
		this.createBy = "ramesh";
		this.updatedBy = "ramesh";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}