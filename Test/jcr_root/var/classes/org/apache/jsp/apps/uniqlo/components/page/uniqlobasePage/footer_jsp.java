package org.apache.jsp.apps.uniqlo.components.page.uniqlobasePage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
