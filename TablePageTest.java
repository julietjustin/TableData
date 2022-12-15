package com.obsqura.assignmentwithpom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CommonHeadderPage;
import pages.TablePage;

public class TablePageTest extends Base {
	TablePage tablePageObj;
	CommonHeadderPage commonHeadderPageObj;
	@Test
	public void verifyGetRow() throws IOException {
		commonHeadderPageObj=new CommonHeadderPage(driver);
		commonHeadderPageObj.mainMenuClick("Table");
		tablePageObj=new TablePage(driver);
		tablePageObj.getRow();
	}


}
