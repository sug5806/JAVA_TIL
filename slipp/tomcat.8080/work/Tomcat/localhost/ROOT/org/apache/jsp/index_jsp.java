/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2021-06-06 08:35:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/include/header.jspf", Long.valueOf(1622966115000L));
    _jspx_dependants.put("/include/footer.jspf", Long.valueOf(1622966115000L));
    _jspx_dependants.put("file:/Users/bell/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1611118066000L));
    _jspx_dependants.put("/include/navigation.jspf", Long.valueOf(1622966115000L));
    _jspx_dependants.put("jar:file:/Users/bell/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"kr\">\n");
      out.write("<head>\n");
      out.write("\t");
      out.write("\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>SLiPP Java Web Programming</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<link href=\"/css/styles.css\" rel=\"stylesheet\">");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-fixed-top header\">\n");
      out.write("  <div class=\"col-md-12\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("      <a href=\"/\" class=\"navbar-brand\">SLiPP</a>\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse1\">\n");
      out.write("        <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbar-collapse1\">\n");
      out.write("      <form class=\"navbar-form pull-left\">\n");
      out.write("        <div class=\"input-group\" style=\"max-width:470px;\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\n");
      out.write("          <div class=\"input-group-btn\">\n");
      out.write("            <button class=\"btn btn-default btn-primary\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-bell\"></i></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"https://slipp.net\" target=\"_blank\">SLiPP</a></li>\n");
      out.write("            <li><a href=\"https://facebook.com\" target=\"_blank\">Facebook</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"/users\"><i class=\"glyphicon glyphicon-user\"></i></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"navbar navbar-default\" id=\"subnav\">\n");
      out.write("  <div class=\"col-md-12\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a href=\"/\" style=\"margin-left:15px;\" class=\"navbar-btn btn btn-default btn-plus dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-home\" style=\"color:#dd1111;\"></i> Home <small><i class=\"glyphicon glyphicon-chevron-down\"></i></small></a>\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbar-collapse2\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Posts</a></li>\n");
      out.write("        ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\" id=\"main\">\n");
      out.write("\t<div class=\"col-md-12 col-sm-12 col-lg-10 col-lg-offset-1\">\n");
      out.write("\t\t<div class=\"panel panel-default qna-list\">\n");
      out.write("\t\t\t<ul class=\"list\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t\t\t<strong class=\"subject\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"./qna/show.html\">국내에서 Ruby on Rails와 Play가 활성화되기 힘든 이유는 뭘까?</a>\n");
      out.write("\t\t\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"auth-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-add-comment\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">2016-01-15 18:47</span>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"./user/profile.html\" class=\"author\">자바지기</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"reply\" title=\"댓글\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-reply\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"point\">8</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t\t\t<strong class=\"subject\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"./qna/show.html\">runtime 에 reflect 발동 주체 객체가 뭔지 알 방법이 있을까요?</a>\n");
      out.write("\t\t\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"auth-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-add-comment\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">2016-01-05 18:47</span>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"./user/profile.html\" class=\"author\">김문수</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"reply\" title=\"댓글\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-reply\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"point\">12</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-center\">\n");
      out.write("\t\t\t\t\t<ul class=\"pagination center-block\" style=\"display:inline-block;\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">«</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">»</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 qna-write\">\n");
      out.write("\t\t\t\t\t<a href=\"./qna/form.html\" class=\"btn btn-primary pull-right\" role=\"button\">질문하기</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--login modal-->\n");
      out.write("<!--\n");
      out.write("<div id=\"loginModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <h2 class=\"text-center\"><img src=\"https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100\" class=\"img-circle\"><br>Login</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form class=\"form col-md-12 center-block\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"userId\">사용자 아이디</label>\n");
      out.write("                  <input class=\"form-control\" name=\"userId\" placeholder=\"User ID\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"password\">비밀번호</label>\n");
      out.write("                  <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <button class=\"btn btn-primary btn-lg btn-block\">로그인</button>\n");
      out.write("                  <span class=\"pull-right\"><a href=\"#registerModal\" role=\"button\" data-toggle=\"modal\">회원가입</a></span>\n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("          <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!--register modal-->\n");
      out.write("<!--\n");
      out.write("<div id=\"registerModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <h2 class=\"text-center\"><img src=\"https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100\" class=\"img-circle\"><br>회원가입</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form class=\"form col-md-12 center-block\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"userId\">사용자 아이디</label>\n");
      out.write("                  <input class=\"form-control\" id=\"userId\" name=\"userId\" placeholder=\"User ID\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"password\">비밀번호</label>\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"name\">이름</label>\n");
      out.write("                  <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"email\">이메일</label>\n");
      out.write("                  <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("              </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button class=\"btn btn-primary btn-lg btn-block\">회원가입</button>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("          <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- script references -->\n");
      out.write("<script src=\"/js/jquery-2.2.0.min.js\"></script>\n");
      out.write("<script src=\"/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /include/navigation.jspf(39,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("      <ul class=\"nav dropdown-menu\">\n");
        out.write("        <li><a href=\"/users/profile?userId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"glyphicon glyphicon-user\" style=\"color:#1111dd;\"></i> Profile</a></li>\n");
        out.write("        <li class=\"nav-divider\"></li>\n");
        out.write("        <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\" style=\"color:#dd1111;\"></i> Settings</a></li>\n");
        out.write("      </ul>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /include/navigation.jspf(51,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <li><a href=\"/users/logout\" role=\"button\">로그아웃</a></li>\n");
        out.write("        <li><a href=\"/users/updateForm?userId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" role=\"button\">개인정보수정</a></li>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <li><a href=\"/users/loginForm\" role=\"button\">로그인</a></li>\n");
        out.write("        <li><a href=\"/users/form\" role=\"button\">회원가입</a></li>\n");
        out.write("        <!--\n");
        out.write("        <li><a href=\"#loginModal\" role=\"button\" data-toggle=\"modal\">로그인</a></li>\n");
        out.write("        <li><a href=\"#registerModal\" role=\"button\" data-toggle=\"modal\">회원가입</a></li>\n");
        out.write("        -->\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
