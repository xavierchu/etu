package org.summer.etu.servlet.tags;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.summer.etu.common.ServerInfoHolder;

public class ResourceImportTag extends BodyTagSupport {

	private static final long serialVersionUID = 3118978445330862687L;

	private String src;

	public int doStartTag() throws JspTagException {
		return EVAL_BODY_BUFFERED;
	}

	public int doEndTag() throws JspTagException {
		HttpServletRequest request = (HttpServletRequest) pageContext
				.getRequest();
		String path = request.getContextPath();
		try {
			StringBuffer sb = new StringBuffer();
			if (this.getSrc().endsWith(".css")) {
				sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"")
						.append(path).append("/").append(this.getSrc())
						.append("?").append(ServerInfoHolder.getStartTime())
						.append("\" />");
				pageContext.getOut().print(sb.toString());
			} else if (this.getSrc().endsWith(".js")) {
				sb.append("<script type=\"text/javascript\" src=\"")
						.append(path).append("/").append(this.getSrc())
						.append("?").append(ServerInfoHolder.getStartTime())
						.append("\">");
				pageContext.getOut().print(sb.toString());
			} else {
				pageContext.getOut().print("");
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			throw new JspTagException(e.getMessage());
		}

		return SKIP_BODY;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

}
