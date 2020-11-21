package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Subtask;
import com.techlab.service.SubtaskService;
import com.techlab.viewmodel.EditTaskViewModel;

public class EditSubtaskAction extends ActionSupport implements ModelDriven<EditTaskViewModel> {

	@Autowired
	private SubtaskService service;
	private EditTaskViewModel vm;

	public String execute() {
		Subtask subtask = service.getSubtask(vm.getId());
		vm.setTitle(subtask.getTitle());
		return "success";
	}

	public String editSubtaskDo() {
		service.editSubtask(vm.getId(), vm.getTitle());
		return "success";
	}

	public void validateEditSubtaskDo() {
		if (vm.getTitle().equals("")) {
			addFieldError("title", "Enter Title");
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
