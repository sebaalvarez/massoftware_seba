package com.massoftware.windows;

import org.cendra.jdbc.ex.crud.DeleteForeingObjectConflictException;
import org.cendra.jdbc.ex.crud.InsertDuplicateException;
import org.cendra.jdbc.ex.crud.UniqueException;

import com.vaadin.data.Validator.InvalidValueException;
import com.vaadin.server.Page;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;

public class LogAndNotification {

	public static void printError(String title, String msg) {
		Notification notification = new Notification(title, msg,
				Type.WARNING_MESSAGE);
		// notification.setStyleName("warning failure");
		notification.setStyleName("tray failure");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());
	}

	public static void print(Exception e) {
		Notification notification = new Notification(
				"Error Interno del Sistema", e.toString(), Type.ERROR_MESSAGE);
		notification.setStyleName("error bar small closable");
		notification.setPosition(Position.BOTTOM_LEFT);
		Integer delayMsec = -1;
		notification.setDelayMsec(delayMsec);

		notification.show(Page.getCurrent());

		e.printStackTrace();
	}

	public static void print(DeleteForeingObjectConflictException e,
			String humanObject) {
		Notification notification = new Notification("Objeto no borrable",
				e.getMessage(), Type.WARNING_MESSAGE);
		// notification.setStyleName("warning failure");
		notification.setStyleName("tray failure");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());

		// e.printStackTrace();
	}

	public static void print(InvalidValueException e) {
		Notification notification = new Notification("Campo inválido",
				e.getMessage(), Type.WARNING_MESSAGE);
		// notification.setStyleName("warning failure");
		notification.setStyleName("tray failure");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());

		// e.printStackTrace();
	}

	public static void print(InsertDuplicateException e) {
		Notification notification = new Notification("Duplicación de datos",
				e.getMessage(), Type.WARNING_MESSAGE);
		// notification.setStyleName("warning failure");
		notification.setStyleName("tray failure");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());

		// e.printStackTrace();
	}
	
	public static void print(UniqueException e) {
		Notification notification = new Notification("Duplicación de datos",
				e.getMessage(), Type.WARNING_MESSAGE);
		// notification.setStyleName("warning failure");
		notification.setStyleName("tray failure");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());

		// e.printStackTrace();
	}

	public static void printSuccessOk(String msg) {
		Notification notification = new Notification("Ok", msg,
				Type.HUMANIZED_MESSAGE);
		// notification.setStyleName("humanized success");
		notification.setStyleName("tray success");
		notification.setPosition(Position.BOTTOM_LEFT);
		// notification.setDelayMsec(10000);
		notification.show(Page.getCurrent());
	}

}