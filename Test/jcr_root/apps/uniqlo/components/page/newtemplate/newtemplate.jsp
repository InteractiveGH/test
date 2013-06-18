<%--

  Base Page component component.



--%><%@page session="false"
            contentType="text/html; charset=utf-8"
            import="com.day.cq.commons.Doctype,
                    com.day.cq.wcm.api.WCMMode,
                    com.day.cq.wcm.foundation.ELEvaluator" %><%
%><%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@include file="/libs/foundation/global.jsp"%>
                        <%
%><cq:defineObjects/><%

    // read the redirect target from the 'page properties' and perform the
    // redirect if WCM is disabled.
    String location = properties.get("redirectTarget", "");
    // resolve variables in path
    location = ELEvaluator.evaluate(location, slingRequest, pageContext);
    if (WCMMode.fromRequest(request) != WCMMode.EDIT && location.length() > 0) {
        // check for recursion
        if (!location.equals(currentPage.getPath())) {
            response.sendRedirect(request.getContextPath() + location + ".html");
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        return;
    }
    // set doctype
    currentDesign.getDoctype(currentStyle).toRequest(request);

%><!doctype html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<cq:include script="/libs/wcm/core/components/init/init.jsp" />
<cq:include path="uniqlo/components/components/header" resourceType="uniqlo/components/components/header" />

This is a page from new template
<cq:include path="par" resourceType="foundation/components/parsys" />
<cq:include path="uniqlo/components/components/footer" resourceType="uniqlo/components/components/footer" />
</body>
</html>