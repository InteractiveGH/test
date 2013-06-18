package org.apache.jsp.apps.uniqlo.components.components.uniqlofooter;

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

public final class uniqlofooter_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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







	// TODO add you code here

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"gFooter\" class=\"chrome-width\"> <div id=\"footerBar\" class=\"footerBar\"> <span id=\"expColIcon\">+</span> <h2 class=\"ubold\">About UNIQLO</h2> <span class=\"arrowHolder\" ><img src=\"/us/assets/img/footer_bottom.png\" class=\"footerArrowIMG\" ></span> <p>&copy; UNIQLO CO., LTD. All right reserved </p> </div> <div class=\"content\"> <div class=\"clearfix\"> <section class=\"col first\"> <h3>About Us</h3> <ul> <li><a href=\"/us/about-uniqlo\">COMPANY INFO</a></li> <li><a href=\"/us/uniqlo-news\">UNIQLO NEWS</a></li> <li><a href=\"http://www.fastretailing.com/eng/ir/\" target=\"_blank\">INVESTOR RELATIONS</a></li> <li><a href=\"/us/social-responsibility\">SOCIAL RESPONSIBILITY</a></li> <li><a href=\"/us/sponsored-athletes\">SPONSORED ATHLETES</a></li> </ul> </section> <section class=\"col \"> <h3>Get Help</h3> <ul> <li><a href=\"mailto:wecare@mail.uniqlo-usa.com?Subject=UNIQLO%20Help%20Request&amp;Body=Please%20enter%20any%20questions%20or%20comments%20you%20may%20have%20below%20this%20line.%20%20A%20UNIQLO%20representative%20will%20contact%20you%20shortly.%0A-----------------------------------------------------------%0A\">WECARE@MAIL.UNIQLO-USA.COM</a></li> <li><a href=\"/us/help/faqs\">TOP QUESTIONS</a></li> <li><a href=\"/us/help/shipping\">SHIPPING</a></li> <li><a href=\"/us/help/returns\">RETURNS</a></li> <li><a href=\"/us/help/order-status\">ORDER STATUS UPDATES</a></li> <li><a href=\"/us/help/stores\">STORE LOCATIONS</a></li> </ul> </section> <section class=\"col\"> <h3>Our Policies</h3> <ul> <li><a href=\"/us/help/terms-conditions\">TERMS OF USE</a></li> <li><a href=\"/us/help/privacy-policy\">PRIVACY AND COOKIES</a></li> </ul> </section> <section class=\"col last\"> <h3>Follow Us</h3> <ul> <li><a href=\"https://www.facebook.com/uniqlo.us\" class=\"facebook\" target=\"social\">Facebook</a></li> <li><a href=\"https://twitter.com/UniqloUSA\" class=\"twitter\" target=\"social\">Twitter</a></li> </ul> </section> </div> <div class=\"customizeCont clearfix\"> <section> <h3>Sign Up</h3> <form name=\"signup\" method=\"post\" action=\"https://www.uniqlo.com/us/store/FSC05610E01.do\"> <input type=\"text\" name=\"mailAddrLogin\" class=\"ubold\" placeholder=\"Enter Email Address\" maxlength=\"64\"> <input type=\"hidden\" value=\"01\" name=\"subscriptionSelectedList\"> <button type=\"submit\" name=\"btnSubmit\" class=\"ubold\">SUBMIT</button> </form> </section> <section> <h3>Choose Region</h3> <div class=\"region\"> <span>^</span> <ul> <li><a href=\"http://www.uniqlo.cn/\" target=\"_blank\">China</a></li> <li><a href=\"http://www.uniqlo.com/fr/\">France</a></li> <li><a href=\"http://www.uniqlo.com/hk/\">Hong Kong</a></li> <li><a href=\"http://www.uniqlo.com/jp/\">Japan</a></li> <li><a href=\"http://www.uniqlo.kr\">Korea</a></li> <li><a href=\"http://www.uniqlo.com/my/\">Malaysia</a></li> <li><a href=\"http://www.uniqlo.com/ph/\">Philippines</a></li> <li><a href=\"http://www.uniqlo.com/ru/\">Russia</a></li> <li><a href=\"http://www.uniqlo.com/sg/\">Singapore</a></li> <li><a href=\"http://www.uniqlo.com/tw/\">Taiwan</a></li> <li><a href=\"http://www.uniqlo.com/th/\">Thailand</a></li> <li><a href=\"http://www.uniqlo.com/uk/\">UK</a></li> <li><a href=\"http://www.uniqlo.com\" class=\"current\">US-English</a></li> </ul> </div> </section> </div> </div> </footer>");
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
