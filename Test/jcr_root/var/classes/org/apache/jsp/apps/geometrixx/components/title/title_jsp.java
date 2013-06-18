package org.apache.jsp.apps.geometrixx.components.title;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;

public final class title_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/libs/foundation/global.jsp");
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.0");
    _jspx_dependants.add("tld:http://www.day.com/taglibs/cq/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/fmt");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/functions");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody.release();
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











      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f0 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f0 = _jspx_th_cq_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      com.day.cq.wcm.api.components.ComponentContext componentContext = null;
      com.day.cq.wcm.api.components.EditContext editContext = null;
      org.apache.sling.api.resource.ValueMap properties = null;
      com.day.cq.wcm.api.PageManager pageManager = null;
      com.day.cq.wcm.api.Page currentPage = null;
      com.day.cq.wcm.api.Page resourcePage = null;
      com.day.cq.commons.inherit.InheritanceValueMap pageProperties = null;
      com.day.cq.wcm.api.components.Component component = null;
      com.day.cq.wcm.api.designer.Designer designer = null;
      com.day.cq.wcm.api.designer.Design currentDesign = null;
      com.day.cq.wcm.api.designer.Design resourceDesign = null;
      com.day.cq.wcm.api.designer.Style currentStyle = null;
      com.adobe.granite.xss.XSSAPI xssAPI = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      componentContext = (com.day.cq.wcm.api.components.ComponentContext) _jspx_page_context.findAttribute("componentContext");
      editContext = (com.day.cq.wcm.api.components.EditContext) _jspx_page_context.findAttribute("editContext");
      properties = (org.apache.sling.api.resource.ValueMap) _jspx_page_context.findAttribute("properties");
      pageManager = (com.day.cq.wcm.api.PageManager) _jspx_page_context.findAttribute("pageManager");
      currentPage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("currentPage");
      resourcePage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("resourcePage");
      pageProperties = (com.day.cq.commons.inherit.InheritanceValueMap) _jspx_page_context.findAttribute("pageProperties");
      component = (com.day.cq.wcm.api.components.Component) _jspx_page_context.findAttribute("component");
      designer = (com.day.cq.wcm.api.designer.Designer) _jspx_page_context.findAttribute("designer");
      currentDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("currentDesign");
      resourceDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("resourceDesign");
      currentStyle = (com.day.cq.wcm.api.designer.Style) _jspx_page_context.findAttribute("currentStyle");
      xssAPI = (com.adobe.granite.xss.XSSAPI) _jspx_page_context.findAttribute("xssAPI");


    // add more initialization code here






    // first calculate the correct title - look for our sources if not set in paragraph
    String title = properties.get(NameConstants.PN_TITLE, String.class);
    if (title == null || title.equals("")) {
        // might be propagate from a head component
        title = (String) request.getAttribute("com.day.apps.geometrixx.title.pagetitle");

    }
    if (title == null || title.equals("")) {
        title = resourcePage.getPageTitle();
    }
    if (title == null || title.equals("")) {
        title = resourcePage.getTitle();
    }
    if (title == null || title.equals("")) {
        title = resourcePage.getName();
    }
    String defType = currentStyle.get("defaultType", "large");
    String type = properties.get("type", defType);
    String link = properties.get("href", "");
    if (link.length() > 0) {
        
      out.write("<a href=\"");
      out.print( xssAPI.getValidHref(link) );
      out.write('"');
      out.write('>');

    }
    if (type.equals("small")) {
        
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f0 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f0.setParent(null);
      // /apps/geometrixx/components/title/title.jsp(44,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setProperty("jcr:title");
      // /apps/geometrixx/components/title/title.jsp(44,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setValue( title );
      // /apps/geometrixx/components/title/title.jsp(44,10) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setTagName("h3");
      // /apps/geometrixx/components/title/title.jsp(44,10) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f0.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f0 = _jspx_th_cq_005ftext_005f0.doStartTag();
      if (_jspx_th_cq_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f0);

    } else if (type.equals("link")) {
        
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f1 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f1.setParent(null);
      // /apps/geometrixx/components/title/title.jsp(46,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setProperty("jcr:title");
      // /apps/geometrixx/components/title/title.jsp(46,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setValue( "\u00bb " + title );
      // /apps/geometrixx/components/title/title.jsp(46,10) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setTagName("p");
      // /apps/geometrixx/components/title/title.jsp(46,10) name = tagClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setTagClass("link");
      // /apps/geometrixx/components/title/title.jsp(46,10) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f1.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f1 = _jspx_th_cq_005ftext_005f1.doStartTag();
      if (_jspx_th_cq_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005ftagClass_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f1);

    } else if (type.equals("extralarge")) {
        
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f2 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f2.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f2.setParent(null);
      // /apps/geometrixx/components/title/title.jsp(48,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f2.setProperty("jcr:title");
      // /apps/geometrixx/components/title/title.jsp(48,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f2.setValue( title );
      // /apps/geometrixx/components/title/title.jsp(48,10) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f2.setTagName("h1");
      // /apps/geometrixx/components/title/title.jsp(48,10) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f2.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f2 = _jspx_th_cq_005ftext_005f2.doStartTag();
      if (_jspx_th_cq_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f2);

    } else {
        
      //  cq:text
      com.day.cq.wcm.tags.TextTag _jspx_th_cq_005ftext_005f3 = (com.day.cq.wcm.tags.TextTag) _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.get(com.day.cq.wcm.tags.TextTag.class);
      _jspx_th_cq_005ftext_005f3.setPageContext(_jspx_page_context);
      _jspx_th_cq_005ftext_005f3.setParent(null);
      // /apps/geometrixx/components/title/title.jsp(50,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f3.setProperty("jcr:title");
      // /apps/geometrixx/components/title/title.jsp(50,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f3.setValue( title );
      // /apps/geometrixx/components/title/title.jsp(50,10) name = tagName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f3.setTagName("h2");
      // /apps/geometrixx/components/title/title.jsp(50,10) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005ftext_005f3.setEscapeXml(true);
      int _jspx_eval_cq_005ftext_005f3 = _jspx_th_cq_005ftext_005f3.doStartTag();
      if (_jspx_th_cq_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005ftext_005fvalue_005ftagName_005fproperty_005fescapeXml_005fnobody.reuse(_jspx_th_cq_005ftext_005f3);

    }
    if (link.length() > 0) {
        
      out.write("</a>");

    }
    
      out.write('\n');
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
