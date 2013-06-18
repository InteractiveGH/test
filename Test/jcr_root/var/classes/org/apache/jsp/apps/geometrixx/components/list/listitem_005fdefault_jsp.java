package org.apache.jsp.apps.geometrixx.components.list;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.api.Page;

public final class listitem_005fdefault_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("tld:http://www.day.com/taglibs/cq/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;







    Page listItem = (Page) request.getAttribute("listitem");

      out.write("<li>\n");
      out.write("    <a href=\"");
      out.print( listItem.getPath() );
      out.write(".html\">\n");
      out.write("        ");
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f0 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f0.setParent(null);
      // /apps/geometrixx/components/list/listitem_default.jsp(29,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setValue( listItem.getTitle() );
      // /apps/geometrixx/components/list/listitem_default.jsp(29,8) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setTagName("h4");
      // /apps/geometrixx/components/list/listitem_default.jsp(29,8) name = placeholder type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setPlaceholder("");
      // /apps/geometrixx/components/list/listitem_default.jsp(29,8) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f0 = _jspx_th_cq_005ftext_005f0.doStartTag();
      if (_jspx_th_cq_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f0);
      out.write("\n");
      out.write("        ");
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f1 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f1.setParent(null);
      // /apps/geometrixx/components/list/listitem_default.jsp(30,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setValue( listItem.getDescription() );
      // /apps/geometrixx/components/list/listitem_default.jsp(30,8) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setTagName("p");
      // /apps/geometrixx/components/list/listitem_default.jsp(30,8) name = placeholder type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setPlaceholder("");
      // /apps/geometrixx/components/list/listitem_default.jsp(30,8) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f1 = _jspx_th_cq_005ftext_005f1.doStartTag();
      if (_jspx_th_cq_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fplaceholder_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f1);
      out.write("\n");
      out.write("    </a>\n");
      out.write("</li>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
