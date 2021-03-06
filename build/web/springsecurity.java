 @Secured("ROLE_USER")
    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
     logger.debug("Received request to show common page");
     
     // Do your work here. Whatever you like
     // i.e call a custom service to do your business
     // Prepare a model to be used by the JSP page
      
     // This will resolve to /WEB-INF/jsp/commonpage.jsp
     return "commonpage";
 }
     
    /**
     * Handles and retrieves the admin JSP page that only admins can see
     * 
     * @return the name of the JSP page
     */
 @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
     logger.debug("Received request to show admin page");
     
     // Do your work here. Whatever you like
     // i.e call a custom service to do your business
     // Prepare a model to be used by the JSP page
      
     // This will resolve to /WEB-INF/jsp/adminpage.jsp
     return "adminpage";
 }
}