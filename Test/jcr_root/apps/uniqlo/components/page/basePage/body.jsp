<%--
  Copyright 1997-2009 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Default body script.

  Draws the HTML body with the page content.

  ==============================================================================

--%>
<%@include file="/apps/uniqlo/components/global/global.jsp" %>
<%@page import="com.saw.utils.*,java.util.*,org.apache.commons.lang.*"%>
<%
log.trace("Current Node: " + (currentNode != null ? currentNode.getPath() : "null"));
log.trace("Current Page: " + (currentPage != null ? currentPage.getPath() : "null"));

WCMMode mode = WCMMode.fromRequest(request);
boolean isEditMode = (mode == WCMMode.EDIT); 
pageContext.setAttribute("isEditMode", isEditMode);



%>

<body ${ pageScope.isEditMode ? "class='editmode'" : "" }>

<cq:include path="par" resourceType="foundation/components/parsys" />
    <cq:include script="header.jsp"  />
    <cq:include script="content.jsp"/>
    <cq:include script="footer.jsp" />



</body>