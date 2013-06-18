package org.apache.jsp.apps.uniqlo.components.components.uniqloheader;

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

public final class uniqloheader_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("/*<![CDATA[*/\n");
      out.write("\n");
      out.write("(!window.un)? window.un = {} : true;\n");
      out.write("un.ntt = {};\n");
      out.write("un.ntt.IMG_SERVER = \"http://im.uniqlo.com\";\n");
      out.write("un.ntt.API_DOMAIN = \"http://www.uniqlo.com\";\n");
      out.write("\n");
      out.write("/*]]>*/\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<header id=\"gHead\"> <div id=\"topNav\" class=\"top-nav chrome-width\"> <div class=\"clearfix gutter chrome-width\" id=\"primaryHeader\"> <a href=\"www.uniqlo.com/us/\" class=\"logo-japanese\" title=\"UNIQLO\">UNIQLO</a> <a href=\"www.uniqlo.com/us/\" class=\"logo\" title=\"UNIQLO\">UNIQLO</a><div id=\"search\" class=\"searchcontainer\"> <form method=\"get\" action=\"/us/search\" id=\"searchForm\"> <input type=\"text\" class=\"ubold\" id=\"key_words\" name=\"q\" value=\"\" /> <button type=\"submit\">Search</button> <a href=\"www.uniqlo.com#\" class=\"reset\">x</a> </form> </div><div id=\"primary\"> <nav> <ul> <li class=\"women\"><a href=\"www.uniqlo.com/us/womens-clothing\" class=\"\">Women</a></li> <li class=\"men\"><a href=\"www.uniqlo.com/us/mens-clothing\">Men</a></li> <li class=\"girls\"><a href=\"www.uniqlo.com/us/girls-clothing\">Girls</a></li> <li class=\"boys\"><a href=\"www.uniqlo.com/us/boys-clothing\">Boys</a></li> <li class=\"company\"><a href=\"www.uniqlo.com/us/company\">Company</a></li> <li class=\"help last-nav\"><a href=\"www.uniqlo.com/us/help/\">Help U</a></li> </ul> </nav> <div class=\"shoppingbag\"> <div id=\"customerName\" class=\"customername\"><a href=\"www.uniqlo.com#\" data-not-logged-in-url=\"https://www.uniqlo.com/us/store/FSC01010E02.do\">Sign In / Register</a></div> <div class=\"bagcount\"><a class=\"bagCount\" href=\"www.uniqlo.com#\">0</a></div> </div> <div id=\"customerMenu\"> <ul> <li class=\"fbStatus\"><a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/store/FSC05020SCR.do\" class=\"first\">My Account</a><span></span></li> <li class=\"fbStatus\"><a href=\"www.uniqlo.comhttps://www.uniqlo.com/us/store/FSC05020E02.do\" class=\"\">Profile Details</a><span></span></li> <li class=\"\"><a href=\"www.uniqlo.comhttps://www.uniqlo.com/us/store/FSC05020E03.do\">Address Book</a><span></span></li> <li class=\"\"><a href=\"www.uniqlo.comhttps://www.uniqlo.com/us/store/FSC05020E01.do\">Order History</a><span></span></li> <li class=\"fbStatus last\"><a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/store/FSC05030SCR.do\" class=\"\">Faves</a><span></span></li> <li class=\"fbStatus\"><a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/store/FSC01010E03.do\">Sign Out</a></li> </ul> </div> <div id=\"customerItems\"> <h3>Items Added To Bag</h3> <ul> <li class=\"clearfix\"><p>Items</p><span class=\"bagCount\">0</span></li> <li class=\"last\"><p>Subtotal</p><span class=\"cartTotal\">0</span></li> </ul> <a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/store/FSC03010SCR.do\" id=\"viewShoppingBag\">View Bag</a> </div> </div> </div> <div class=\"clearfix ubold chrome-width\" id=\"secondary\"> <div id=\"WomenNav\" class=\"secondaryNav\"> <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\"> <thead> <tr> <th><a class=\"cat-nav\">Featured</a></th><th><a class=\"cat-nav\">Collections</a></th><th><a class=\"cat-nav\">Outerwear</a></th><th><a class=\"cat-nav\">Tops</a></th><th><a class=\"cat-nav\">Bottoms</a></th><th><a class=\"cat-nav\">Innerwear + Lounge</a></th><th><a class=\"cat-nav\">Accessories</a></th> </tr> </thead> <tr class=\"tertiarynav\"> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing\">UNIQLO Weekly Picks</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/featured/womens-spring-dress-up\">Spring Dress Up</a></li><li><a href=\"www.uniqlo.com/us/ut-2013-lifewear\">UT Campaign 2013</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/karen-walker\">Karen Walker</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/cabbages-and-roses\">Cabbages & Roses</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/celia-birtwell\">CELIA BIRTWELL</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-airism-collection\">AIRism</a></li><li><a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/bra-tops/\">BRA TOP COLLECTION</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-linen\">Linen Collection</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-uv-collection\">UV Collection</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-colored-bottoms\">Colored Bottoms</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/greengate\">Greengate</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-designers-invitation-project\">Designer Invitation Project</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/ut-tshirts\">UT: Uniqlo T-shirts </a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/collections/womens-extended-sizes\">Extended Sizes</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-outerwear/womens-blazers\">Blazers</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-outerwear/womens-jackets\">Jackets</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-outerwear/womens-coats\">Coats</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-t-shirts\">T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-printed-t-shirts\">Printed T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-shirts-and-blouses\">Shirts + Blouses</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-dresses\">Dresses</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-sweaters-and-knits\">Sweaters + Knits</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-tops/womens-sweatshirts\">Sweatshirts</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-bottoms/womens-jeans\">Jeans</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-bottoms/womens-leggings\">Leggings</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-bottoms/womens-pants\">Pants</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-bottoms/shorts-and-cropped\">Shorts + Cropped</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-bottoms/womens-skirts\">Skirts</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-underwear-and-loungewear/womens-underwear\">Underwear</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-underwear-and-loungewear/bras\">Bras</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-underwear-and-loungewear/tops\">Tops</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-underwear-and-loungewear/loungewear\">Loungewear</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-underwear-and-loungewear/womens-socks-and-tights\">Socks + Tights</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-accessories/womens-belts\">Belts</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-accessories/womens-hats\">Hats</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-accessories/womens-scarves\">Scarves</a></li><li><a href=\"www.uniqlo.com/us/womens-clothing/womens-accessories\">Accessories</a></li> </ul> </td> </tr> </table> </div> <div id=\"MenNav\" class=\"secondaryNav\"> <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\"> <thead> <tr> <th><a class=\"cat-nav\">Featured</a></th><th><a class=\"cat-nav\">Collections</a></th><th><a class=\"cat-nav\">Outerwear</a></th><th><a class=\"cat-nav\">Tops</a></th><th><a class=\"cat-nav\">Bottoms</a></th><th><a class=\"cat-nav\">Innerwear + Lounge</a></th><th><a class=\"cat-nav\">Accessories</a></th> </tr> </thead> <tr class=\"tertiarynav\"> <td> <ul><li><a href=\"www.uniqlo.comhttp://www.uniqlo.com/us/adam-scott/\">Adam Scottâs 2013 Masters Style</a></li><li><a href=\"www.uniqlo.com/us/featured/fathers-day-gifts\">Father's Day Collection</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing\">UNIQLO Weekly Picks</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/featured/mens-spring-ensembles\">Spring Ensembles</a></li><li><a href=\"www.uniqlo.com/us/ut-2013-lifewear\">UT Campaign 2013</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/michael-bastian\">Uniqlo X Michael Bastian</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/mens-airism-collection\">AIRism</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/djokovic-performance-wear-workout-clothes\">Djokovic Performance Wear</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/sportswear\">SPORTSWEAR COLLECTION</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/mens-linen\">Linen Collection</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/mens-colored-bottoms\">Colored Bottoms</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/ut-tshirts\">UT: Uniqlo T-shirts </a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/collections/extended-sizes\">Extended Sizes</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-outerwear/mens-blazers\">Blazers</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-outerwear/mens-jackets\">Jackets</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-outerwear/mens-coats\">Coats</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-dress-shirts\">Dress Shirts</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-casual-shirts\">Casual Shirts</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-sweatshirts\">Sweatshirts</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-t-shirts\">T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-printed-t-shirts\">Printed T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-sweaters-and-knits\">Sweaters + Knits</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-tops/mens-polo-shirts\">Polo Shirts</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-bottoms/mens-jeans\">Jeans</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-bottoms/mens-pants\">Pants</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-bottoms/mens-shorts-and-cropped-bottoms\">Shorts + Cropped</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-underwear-and-loungewear/mens-undershirts\">Undershirts </a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-underwear-and-loungewear/mens-underwear\">Underwear</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-underwear-and-loungewear/mens-loungewear\">Loungewear</a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-underwear-and-loungewear/mens-socks\">Socks </a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-accessories/mens-belts\">Belts </a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-accessories/mens-hats\">Hats </a></li><li><a href=\"www.uniqlo.com/us/mens-clothing/mens-accessories\">Accessories</a></li> </ul> </td> </tr> </table> </div> <div id=\"GirlsNav\" class=\"secondaryNav\"> <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\"> <thead> <tr> <th><a class=\"cat-nav\">Collections</a></th><th><a class=\"cat-nav\">Kids</a></th><th><a class=\"cat-nav\">Toddlers + Babies</a></th> </tr> </thead> <tr class=\"tertiarynav\"> <td> <ul><li><a href=\"www.uniqlo.com/us/girls-clothing/collections/karen-walker\">Karen Walker</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/collections/greengate\">Green Gate</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/collections/girls-down-collection\">Down</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/girls-clothing/kids/girls-tops\">Tops</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/kids/girls-printed-t-shirts\">Printed T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/kids/girls-bottoms\">Bottoms</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/kids/girls-underwear-and-loungewear\">Innerwear + Lounge</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/girls-clothing/toddlers-and-babies/toddler-girl-tops\">Tops</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/toddlers-and-babies/toddler-girl-bottoms\">Bottoms</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/toddlers-and-babies/one-pieces-sets\">One-Pieces + Sets</a></li><li><a href=\"www.uniqlo.com/us/girls-clothing/toddlers-and-babies/girls-underwear-and-loungewear\">Innerwear + Lounge</a></li> </ul> </td> </tr> </table> </div> <div id=\"BoysNav\" class=\"secondaryNav\"> <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\"> <thead> <tr> <th><a class=\"cat-nav\">Collections</a></th><th><a class=\"cat-nav\">Kids</a></th><th><a class=\"cat-nav\">Toddlers + Babies</a></th> </tr> </thead> <tr class=\"tertiarynav\"> <td> <ul><li><a href=\"www.uniqlo.com/us/boys-clothing/collections/boys-down-collection\">Down</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/boys-clothing/kids/boys-tops\">Tops</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/kids/boys-printed-t-shirts\">Printed T-Shirts</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/kids/boys-bottoms\">Bottoms</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/kids/boys-underwear-and-loungewear\">Innerwear + Lounge</a></li> </ul> </td> <td> <ul><li><a href=\"www.uniqlo.com/us/boys-clothing/toddler-and-baby-boy-clothes/toddler-boy-tops\">Tops</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/toddler-and-baby-boy-clothes/toddler-boy-bottoms\">Bottoms</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/toddler-and-baby-boy-clothes/baby-boy-clothes/one-pieces-sets\">One-Pieces + Sets</a></li><li><a href=\"www.uniqlo.com/us/boys-clothing/toddler-and-baby-boy-clothes/boys-underwear-and-loungewear\">Innerwear + Lounge</a></li> </ul> </td> </tr> </table> </div> <div id=\"companyNav\" class=\"clearfix secondaryNav image-layout\"> <h3 class=\"companyHeader\">Get To Know Us</h3> <h3 class=\"companyMoreHeader\">More</h3> <div style=\"height:30px;background:#fff\"></div> <table width=\"100%\" class=\"subnav\"> <tbody> <tr> <td class=\"first company\"> <a href=\"www.uniqlo.com/us/about-uniqlo\"> <span class=\"company-title story\">Our Story</span> <span>meet the brand<br />behind the clothes</span> </a> </td> <td class=\"company\"> <a href=\"www.uniqlo.com/us/social-responsibility\"> <span class=\"company-title csr\">CSR</span> <span>Working for positive change</span> </a> </td> <td class=\"company\"> <a href=\"www.uniqlo.com/us/uniqlo-news\"> <span class=\"company-title press\">Press</span> <span>Read about us<br/> in the news</span> </a> </td> <td class=\"company\"> <a href=\"www.uniqlo.com/us/uniqlo-careers\"> <span class=\"company-title careers\">Work With Us</span> <span>Join our<br/> growing familY</span> </a> </td> <td class=\"last\"> <ul class=\"companyUL\"> <li><a href=\"www.uniqlo.com/us/corporate-information\">CORPORATE INFORMATION</a></li> <li><a href=\"www.uniqlo.com/us/sponsored-athletes\">Sponsored Athletes</a></li> <li><a href=\"www.uniqlo.com/us/fast-retailing\">GROUP COMPANIES</a></li> </ul> </td> </tr> </tbody> </table> </div> <div id=\"helpuNav\" class=\"clearfix secondaryNav two-column\"> <div style=\"height:30px;background:#fff\"></div> <table width=\"100%\"> <tbody> <tr> <td> <h2>TALK TO US</h2> <table width=\"100%\" class=\"talk\"> <tbody> <tr> <td class=\"first\"> <a href=\"www.uniqlo.commailto:wecare@mail.uniqlo-usa.com?Subject=UNIQLO%20Help%20Request&amp;Body=Please%20enter%20any%20questions%20or%20comments%20you%20may%20have%20below%20this%20line.%20%20A%20UNIQLO%20representative%20will%20contact%20you%20shortly.%0A-----------------------------------------------------------%0A\" class=\"email\"> <span class=\"talk-title\">EMAIL</span> <span>Whenever, Wherever</span> <span class=\"email-btn\">EMAIL US &nbsp;&nbsp;</span> </a> </td><td class=\"phone-content\"> <div> <a href=\"www.uniqlo.com#\" class=\"phone\"> <span class=\"talk-title\">Phone</span> </a> <div class=\"phone-hours\"> <p class=\"phone-ecommerce\"> <span class=\"phone-title\">ECOMMERCE RELATED INQUIRY</span> <span class=\"day\"><em>1-855-486-4756 (1-855-4UNIQLO)</em></span> <span class=\"day\">Monday - Friday <em>9AM&nbsp;-&nbsp;9PM EST</em></span> <span class=\"day\">Saturday <em>10AM&nbsp;-&nbsp;7PM&nbsp;EST</em></span> <span class=\"day\">Sunday &amp; Holidays&nbsp;<em>Closed</em></span> </p> <p class=\"phone-store\"> <span class=\"phone-title\">STORE RELATED INQUIRY</span> <span class=\"day\"><em>1-877-486-4756 (1-877-4UNIQLO)</em></span> <span class=\"day\">Monday - Saturday <em>10AM&nbsp;-&nbsp;12AM EST</em></span> <span class=\"day\">Sunday <em>11AM&nbsp;-&nbsp;11PM EST</em></span> </p> </div> </div> </td> </tr> </tbody> </table> </td> <td class=\"last\"> <h2>HOW CAN WE HELP?</h2> <ul class=\"help\"> <li><a href=\"www.uniqlo.com/us/help/faqs\">FAQS</a></li> <li><a href=\"www.uniqlo.com/us/help/shipping\">SHIPPING</a></li> <li><a href=\"www.uniqlo.com/us/help/returns\">RETURNS</a></li> <li><a href=\"www.uniqlo.com/us/help/stores\">STORES</a></li> <li><a href=\"www.uniqlo.com/us/help/order-status\">ORDER STATUS</a></li> <li><a href=\"www.uniqlo.com/us/help/privacy-policy\">PRIVACY POLICY</a></li> <li><a href=\"www.uniqlo.com/us/help/terms-conditions\">TERMS +&nbsp;CONDITIONS</a></li> <li><a href=\"www.uniqlo.com/us/help/my-account\">MY ACCOUNT</a></li> </ul> </td> </tr> </tbody> </table> </div> </div> </div> </header>\n");
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
