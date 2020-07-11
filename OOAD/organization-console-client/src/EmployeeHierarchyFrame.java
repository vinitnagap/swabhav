import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.techlabs.model.Employee;
import com.techlabs.model.OrganizationHierarchyBuilder;
import com.techlabs.model.UrlLoader;

public class EmployeeHierarchyFrame extends JFrame {

	public EmployeeHierarchyFrame() throws Throwable {
		// TODO Auto-generated constructor stub
		OrganizationHierarchyBuilder builder = new OrganizationHierarchyBuilder(new UrlLoader());
		Employee employee = builder.getPresident();
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(employee.getEmployeeName());
		checkJunior(employee, node);
		JTree tree = new JTree(node);
		this.add(tree);
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private static void checkJunior(Employee employee, DefaultMutableTreeNode node) {
		for (Employee emp : employee.getEmployees()) {
			DefaultMutableTreeNode senior = new DefaultMutableTreeNode(emp.getEmployeeName());
			checkJunior(emp, senior);
			node.add(senior);

		}
	}
}
