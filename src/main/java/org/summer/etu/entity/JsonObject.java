package org.summer.etu.entity;

import org.springframework.util.Assert;

public class JsonObject<PK, E> {
	private PK id;

	public PK getId() {
		return id;
	}

	public void setId(PK id) {
		this.id = id;
	}

	private E cell;

	public E getCell() {
		return cell;
	}

	public void setCell(E cell) {
		this.cell = cell;
	}

	public JsonObject(PK pk, E e) {
		Assert.notNull(e, "��ʽ������Ϊ�գ�");
		Assert.notNull(pk, "��ʽ����������Ϊ�գ�");
		cell = e;
		id = pk;
	}
}
