package test.java.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.formdev.flatlaf.FlatDarkLaf;

import main.java.controller.AppMainController;
import main.java.controller.LayoutManager;
import main.java.model.User;
import main.java.view.AppMainView;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;

class TimerViewGUITest {
	private FrameFixture window;

	@BeforeAll
	public static void setUpOnce() {
		FailOnThreadViolationRepaintManager.install();
//		DatabaseController dbc = DatabaseController.getInstance();
	}

	@BeforeEach
	public void setUp() {
		new LayoutManager();
		FlatDarkLaf.setup();
		User.setUser(new User(1, "Bob", "bob@msn.com"));
		AppMainView frame = GuiActionRunner.execute(() -> new AppMainView(new AppMainController()));
		window = new FrameFixture(frame);

		window.show(); // shows the frame to test
	}

	@AfterEach
	public void tearDown() {
		// After each test case we close all windows, deallocate Mouse keys etc.
		window.cleanUp();
	}

	@Test
	void integrationTest() {
		window.button("btnMenuDashboard").click();
		window.button("btnMenuProjects").click();
		window.button("btnStart").requireVisible();
//		window.button("btnMenuDashboard").click();
//		window.button("btnStart").requireVisible();
		
//		window.tabbedPane().selectTab(1);
		
//		try {
//			TimeUnit.SECONDS.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		window.
//		window.button("btnStart").click();
//		window.textBox("textFieldCommentTimerView").requireVisible();
//		window.textBox("textFieldCommentTimerView").enterText("IntegTest");
//		window.button("btnStop").click();
//		window.button("btnSaveTimerView").click();
//		FrameFixture mainFrame = findFrame("main").using(robot());
//		window.comboBox("comboBoxProject").click();
	}

//	@Test
//	void testAllButtons() {
//		window.button("btnStart").click();
//		window.button("btnPause").click();
//		window.button("btnStop").click();
//		window.button("btnSave").click();
//		window.button("btnReset").click();
//		window.button("btnLoadProjects").click();
//	}

//	@Test
//	void testInsertComment() {
//		window.textBox("textFieldComment").requireVisible();
//		window.textBox("textFieldComment").enterText("Comment");
//	}

//	@Test
//	void testProjectPanel() {
//		window.panel("projectPanel").isEnabled();
//	}

//	@Test
//	void testAllGuiElements() {
//		JButtonFixture btnStart = window.button("btnStart");
//		assertNotNull(btnStart);
//		window.button("btnStart").click();
//
//		JButtonFixture btnPause = window.button("btnPause");
//		assertNotNull(btnPause);
//		window.button("btnPause").click();
//
//		JButtonFixture btnStop = window.button("btnStop");
//		assertNotNull(btnStop);
//		window.button("btnStop").click();
//
//		JButtonFixture btnSave = window.button("btnSave");
//		assertNotNull(btnSave);
//		window.button("btnSave").click();
//
//		JButtonFixture btnReset = window.button("btnReset");
//		assertNotNull(btnReset);
//		window.button("btnReset").click();
//
//		JButtonFixture btnLoadProjects = window.button("btnLoadProjects");
//		assertNotNull(btnLoadProjects);
//		window.button("btnLoadProjects").click();
//
//		JPanelFixture projectPanel = window.panel("projectPanel");
//		assertNotNull(projectPanel);
//		window.panel("projectPanel").isEnabled();
//	}
}
