package org.apache.jsp.apps.uniqlo.components.page.uniqlobasePage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.WCMMode;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;
import com.day.cq.wcm.api.Template;
import java.text.DecimalFormat;
import javax.jcr.*;
import javax.jcr.query.*;
import java.util.*;
import com.day.cq.commons.Doctype;
import javax.jcr.*;
import org.apache.commons.lang.StringEscapeUtils;

public final class head_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/apps/uniqlo/components/global/global.jsp");
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.0");
    _jspx_dependants.add("tld:http://www.day.com/taglibs/cq/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/fmt");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/functions");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.release();
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

      out.write('\n');
      out.write('\n');










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
      out.write('\n');


    // add more initialization code here
    boolean edit    = WCMMode.fromRequest(request) == WCMMode.EDIT;
    boolean design  = WCMMode.fromRequest(request) == WCMMode.DESIGN;
    boolean publish = WCMMode.fromRequest(request) == WCMMode.DISABLED;
    boolean preview = WCMMode.fromRequest(request) == WCMMode.PREVIEW;
    
   
    
    Session session = resourceResolver.adaptTo(Session.class);
    Template currentTemplate = currentPage.getTemplate();
	
	DecimalFormat money = new DecimalFormat("$#,###,###");
	
 
      out.write('\n');
      out.write(' ');
      out.write('\n');


      out.write('\n');



      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\" />\t\n");
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"//www.uniqlo.com/us/min/serve?g=a138d4cc7c7df3182c2dafa28433dc8d&amp;lm=1370637024\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/*<![CDATA[*/\n");
      out.write("\n");
      out.write("(function() { var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true; ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js'; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s); })();\n");
      out.write("\n");
      out.write("/*]]>*/\n");
      out.write("</script>\n");
      out.write("<title>UNIQLO News | UNIQLO</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Shop UNIQLO.com for the latest women&#039;s, men&#039;s and kids&#039; clothing and accessories. Browse our unique range of high quality basics for every occasion.\"/>\n");
      out.write("\t\t<meta name=\"keywords\" content=\"uniqlo,uniqlo soho NY,soho NY,online store,Casual wear, casual clothing, women&#039;s wear, men&#039;s wear, UNIQLO USA fashion, accessories, t-shirts, bag, tee shirts, bags, clothes, clothing, for men, for women, online, collection, denim, dress, dresses, fashions, jeans, leather, shoes, shopping, style, sweater, sweaters, women&#039;s, trousers, underwear, outerwear, jerseys, jumpers, skirts, knitwear, shorts, shirts, UNIQLO USA, www.uniqlo.com usa\"/>\n");
      out.write("\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"/>\n");
      out.write("\t\t<meta property=\"og:image\" content=\"http://www.uniqlo.com/us/assets_static/fb/uniqlo-us.jpg\"/>\n");
      out.write("\t\t<meta property=\"og:title\" content=\"UNIQLO.com :: Women's, Men's and Kids' Clothing and Accessories\"/>\n");
      out.write("\t\t<meta property=\"og:url\" content=\"http://www.uniqlo.com/us/uniqlo-news\"/>\n");
      out.write("\t\t<meta property=\"og:site_name\" content=\"UNIQLO\"/>\n");
      out.write("\t\t<meta property=\"og:description\" content=\"Shop UNIQLO.com for the latest women's, men's and kids' clothing and accessories. Browse our unique range of high quality basics for every occasion.\"/>\n");
      out.write("\t\t<meta property=\"og:type\" content=\"website\"/>\n");
      out.write("<link rel=\"alternate\" type=\"application/rss+xml\" href=\"http://www.uniqlo.com/us/uniqlo-news/feed/\" title=\"Latest Uniqlo News\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=1024\" />\n");
      out.write("\t\n");
      out.write("<!--[if lt IE 8]>\n");
      out.write("<link href=\"/us/assets_static/jreject/jquery.reject.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"/us/assets_static/jreject/jquery.reject.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t$.reject({\n");
      out.write("\t\treject: { all: true }, // Reject all renderers for demo\n");
      out.write("\t\tcloseCookie: true // Set cookie to remmember close for this session\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_cq_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_cq_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
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

  private boolean _jspx_meth_cq_005fincludeClientLib_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:includeClientLib
    com.adobe.granite.ui.tags.IncludeClientLibraryTag _jspx_th_cq_005fincludeClientLib_005f0 = (com.adobe.granite.ui.tags.IncludeClientLibraryTag) _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody.get(com.adobe.granite.ui.tags.IncludeClientLibraryTag.class);
    _jspx_th_cq_005fincludeClientLib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fincludeClientLib_005f0.setParent(null);
    // /apps/uniqlo/components/page/uniqlobasePage/head.jsp(12,0) name = css type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setCss("apps.uniqlo");
    int _jspx_eval_cq_005fincludeClientLib_005f0 = _jspx_th_cq_005fincludeClientLib_005f0.doStartTag();
    if (_jspx_th_cq_005fincludeClientLib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcss_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:include
    com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f0 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
    _jspx_th_cq_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005finclude_005f0.setParent(null);
    // /apps/uniqlo/components/page/uniqlobasePage/head.jsp(48,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f0.setScript("styles.jsp");
    int _jspx_eval_cq_005finclude_005f0 = _jspx_th_cq_005finclude_005f0.doStartTag();
    if (_jspx_th_cq_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005finclude_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:include
    com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f1 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
    _jspx_th_cq_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cq_005finclude_005f1.setParent(null);
    // /apps/uniqlo/components/page/uniqlobasePage/head.jsp(49,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f1.setScript("customhead.jsp");
    int _jspx_eval_cq_005finclude_005f1 = _jspx_th_cq_005finclude_005f1.doStartTag();
    if (_jspx_th_cq_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
    return false;
  }
}
