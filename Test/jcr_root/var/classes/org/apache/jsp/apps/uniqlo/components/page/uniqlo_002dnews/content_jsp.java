package org.apache.jsp.apps.uniqlo.components.page.uniqlo_002dnews;

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

public final class content_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"section-content\" class=\"gridContent\" >\n");
      out.write("    <h1 class=\"mainTitle\"><a id=\"press-homepage\" href=\"/us/uniqlo-news\">UNIQLO News&nbsp;</a></h1>\n");
      out.write("<!--<h2><a id=\"press-homepage\" href=\"/us/uniqlo-news\">UNIQLO News&nbsp;</a></h2>-->\n");
      out.write("<p class=\"corp-tagline\">\n");
      out.write("\t\t<a class=\"rss\" href=\"/us/uniqlo-news/feed/\">RSS</a>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<nav class=\"uniqlo-dropdown\" id=\"press-nav\" >\n");
      out.write("\t<select>\n");
      out.write("<option value=\"\">Archive</option><option value=\"/us/uniqlo-news/2013/\">2013</option><option value=\"/us/uniqlo-news/2012/\">2012</option><option value=\"/us/uniqlo-news/2011/\">2011</option><option value=\"/us/uniqlo-news/2010/\">2010</option><option value=\"/us/uniqlo-news/2009/\">2009</option><option value=\"/us/uniqlo-news/2008/\">2008</option><option value=\"/us/uniqlo-news/2007/\">2007</option><option value=\"/us/uniqlo-news/2006/\">2006</option>\t</select>\n");
      out.write("</nav>\n");
      out.write("<!-- START outer 2 column wrapper --><div class='corp-box-wrapper clearfix first'>\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix first'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<span class='press-img-wrapper'><span class='press-overLay'></span><img src='/us/assets_static/img/press/MoMA_FFN_facebook.gif' /></span>\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 04.16.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/uniqlo-to-become-the-exclusive-multi-year-sponsor-of-the-museum-of-modern-arts-popular-free-friday-night-admission-program/\">UNIQLO to Become the Exclusive, Multi-Year Sponsor of the Museum of Modern Artâs Popular Free Friday Night Admission Program</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>In May, MoMA Launches UNIQLO Free Friday Nights and Extends Its Public Schedule to Seven Days per Week </p>\t\t\t<a href=\"/us/uniqlo-news/2013/uniqlo-to-become-the-exclusive-multi-year-sponsor-of-the-museum-of-modern-arts-popular-free-friday-night-admission-program/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<span class='press-img-wrapper'><span class='press-overLay'></span><img src='/us/assets_static/img/press/Adam_Press_release_176x176.jpg' /></span>\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 04.15.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/uniqlo-congratulates-adam-scott-on-winning-the-2013-masters-golf-tournament-in-augusta/\">UNIQLO Congratulates Adam Scott on Winning  the 2013 Masters Golf Tournament in Augusta </a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>UNIQLO today congratulates Adam Scott, its recently appointed Global Brand Ambassador, on winning the 2013 Masters Golf Tournament that ended Sunday, April 14, in Augusta, Georgia. This latest victory marks both the first time Mr. Scott has won and the first time for an Australian to win what is known to be one of the most prestigious golf tournaments worldwide.</p> \t\t\t<a href=\"/us/uniqlo-news/2013/uniqlo-congratulates-adam-scott-on-winning-the-2013-masters-golf-tournament-in-augusta/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("</div><!-- END outer 2 column wrapper --><!-- START outer 2 column wrapper --><div class='corp-box-wrapper clearfix'>\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 04.15.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/uniqlo-to-open-at-westchesters-ridge-hill-shopping-center-in-yonkers-ny-on-april-19/\">UNIQLO to Open at Westchesterâs Ridge Hill Shopping Center in Yonkers, NY, on April 19</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>UNIQLO, the global clothing retailer, will open its seventh U.S. store and\n");
      out.write("its first outdoor lifestyle center location this week at Westchesterâs Ridge Hill in Yonkers, NY, on\n");
      out.write("Friday, April 19.</p>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"/us/uniqlo-news/2013/uniqlo-to-open-at-westchesters-ridge-hill-shopping-center-in-yonkers-ny-on-april-19/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<span class='press-img-wrapper'><span class='press-overLay'></span><img src='/us/assets_static/img/press/adam_scott_uniqlo.jpg' /></span>\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 04.09.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/professional-golfer-adam-scott-appointed-as-uniqlo-global-brand-ambassador/\">Professional Golfer Adam Scott Appointed as UNIQLO Global Brand Ambassador- Prominent Pro to Wear UNIQLO Apparel in Competitions </a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\tUNIQLO today announces that it has signed a multi-year contract with Australian pro golfer and world\n");
      out.write("number seven, Adam Scott, for him to act as a Global Brand Ambassador to the leading global Japanese retailer. The first time for\n");
      out.write("UNIQLO to partner with a professional golfer, under the partnership agreement Mr. Scott will wear UNIQLO apparel in all competitions,\n");
      out.write("commencing at the 2013 Masters Golf Tournament from April 8, in Augusta, Georgia. He will also take part in a range of promotional\n");
      out.write("activities for the company, including a UNIQLO global polo shirt campaign to launch in mid-April.\t\t\t<a href=\"/us/uniqlo-news/2013/professional-golfer-adam-scott-appointed-as-uniqlo-global-brand-ambassador/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("</div><!-- END outer 2 column wrapper --><!-- START outer 2 column wrapper --><div class='corp-box-wrapper clearfix'>\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 03.15.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/voluntary-recall-of-certain-childrens-pajamas/\">Voluntary Recall of Certain Children's Pajamas</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\tUNIQLO has initiated a voluntary recall of certain children's pajamas due to violation of federal flammability standards. For more information,\t\t\t<a href=\"/us/uniqlo-news/2013/voluntary-recall-of-certain-childrens-pajamas/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 03.11.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/uniqlo-to-open-at-palisades-center-in-west-nyack-ny/\">UNIQLO to Open at Palisades Center in West Nyack, NY</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\tUNIQLO, the global clothing retailer, will open its second U.S. mall location this week at Palisades Center in West Nyack, NY on Friday, March 15.\t\t\t<a href=\"/us/uniqlo-news/2013/uniqlo-to-open-at-palisades-center-in-west-nyack-ny/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("</div><!-- END outer 2 column wrapper --><!-- START outer 2 column wrapper --><div class='corp-box-wrapper clearfix'>\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 01.09.13</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2013/uniqlo-announces-new-store-openings-at-palisades-center-and-ridge-hill-shopping-centers-in-new-york-spring-2013-uniqlo-continues-their-us-hiring-and-expansion/\">UNIQLO Announces New Store Openings at Palisades Center and Ridge Hill Shopping Centers in New York Spring 2013 &mdash; UNIQLO Continues Their U.S. Hiring and Expansion</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\tUNIQLO, the global clothing retailer, announced it will continue its U.S. expansion strategy by opening two new shopping center locations at Palisades Center in West Nyack, NY, and Westchesterâs Ridge Hill in Yonkers, NY. Both stores are slated to open spring 2013.\t\t\t<a href=\"/us/uniqlo-news/2013/uniqlo-announces-new-store-openings-at-palisades-center-and-ridge-hill-shopping-centers-in-new-york-spring-2013-uniqlo-continues-their-us-hiring-and-expansion/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<span class='press-img-wrapper'><span class='press-overLay'></span><img src='/us/assets_static/img/press/fb_cd_small.gif' /></span>\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 10.24.12</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2012/uniqlo-launches-online-shopping-in-the-us/\">UNIQLO Launches Online Shopping in the U.S. </a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>UNIQLO, the global clothing retailer, is thrilled to announce that the highly anticipated online shopping site <a href=\"http://www.uniqlo.com\">www.uniqlo.com</a> is now live to customers and fans throughout the U.S. Just in time for the 2012 holiday season, UNIQLO's full line of signature products will be available to ship to anywhere in the United States including Alaska and Hawaii.<p/>\t\t\t<a href=\"/us/uniqlo-news/2012/uniqlo-launches-online-shopping-in-the-us/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("</div><!-- END outer 2 column wrapper --><!-- START outer 2 column wrapper --><div class='corp-box-wrapper clearfix last'>\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 10.08.12</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2012/first-west-coast-flagship-store-in-union-square/\">UNIQLO Opens First West Coast Flagship Store in Union Square</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>UNIQLO, the global clothing retailer, will open its new San Francisco store at 111 Powell Street on Friday, October 5th.</p>\t\t\t<a href=\"/us/uniqlo-news/2012/first-west-coast-flagship-store-in-union-square/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- START article wrapper -->\n");
      out.write("\t<div class='corp-box clearfix last no-images'>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"corp_news_posted\">POSTED 09.27.12</p>\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t<a class=\"press-archive-title\" href=\"/us/uniqlo-news/2012/uniqlos-largest-mall-store-in-the-world/\">UNIQLO Opens Store in Westfield Garden State Plaza Mall in NJ UNIQLOâs largest mall store in the world</a>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<p>UNIQLO, the global clothing retailer, will open their new Paramus, New Jersey, store in the Westfield Garden State Plaza this Friday, September 28th.</p>\t\t\t<a href=\"/us/uniqlo-news/2012/uniqlos-largest-mall-store-in-the-world/\" class=\"press-link\">READ MORE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END article wrapper -->\n");
      out.write("</div><!-- END outer 2 column wrapper --></div>\n");
      out.write("<div id=\"section-nav\" class=\"js-section-nav\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li class=\"first \"><a href=\"/us/about-uniqlo\">Our Story</a></li>\n");
      out.write("<li class=\"\"><a href=\"/us/corporate-information\">Corporate Information</a></li>\n");
      out.write("<li class=\"\"><a href=\"/us/social-responsibility\">Social Responsibility</a></li>\n");
      out.write("<li class=\"active\"><a href=\"/us/uniqlo-news\">UNIQLO News</a></li>\n");
      out.write("<li class=\"\"><a href=\"/us/uniqlo-careers\">Work with Us</a></li>\n");
      out.write("<li class=\"\"><a href=\"/us/sponsored-athletes\">Sponsored Athletes</a></li>\n");
      out.write("<li class=\"\"><a href=\"/us/fast-retailing\">Group Companies</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
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
