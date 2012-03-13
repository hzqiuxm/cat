package com.dianping.cat.report.page.sql;

import com.dianping.cat.report.ReportPage;
import com.site.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, Model> {
	@Override
	protected String getJspFilePath(Context ctx, Model model) {
		Action action = model.getAction();

		switch (action) {
		case VIEW:
			return JspFile.VIEW.getPath();
		case GRAPHS:
			return JspFile.GRAPHS.getPath();
		}

		throw new RuntimeException("Unknown action: " + action);
	}
}
