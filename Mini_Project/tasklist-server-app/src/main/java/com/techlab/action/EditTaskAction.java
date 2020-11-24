package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Task;
import com.techlab.service.TaskService;
import com.techlab.viewmodel.EditTaskViewModel;

public class EditTaskAction extends ActionSupport implements ModelDriven<EditTaskViewModel> {

	@Autowired
	private TaskService service;
	private EditTaskViewModel vm;

	public String execute() {
		Task task = service.getTask(vm.getId());
		vm.setTitle(task.getTitle());
		return "success";
	}

	public String editTaskDo() {
		service.editTask(vm.getId(), vm.getTitle());
		return "success";
	}

	public void validateEditTaskDo() {
		if (vm.getTitle().equals("")) {
			addFieldError("title", "*Enter Title");
		}
	}

	@Override
	public EditTaskViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new EditTaskViewModel();
		return vm;
	}

	public EditTaskViewModel getVm() {
		return vm;
	}

	public void setVm(EditTaskViewModel vm) {
		this.vm = vm;
	}

}
