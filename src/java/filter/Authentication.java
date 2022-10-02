/*
 * Authenticate for system
 * If user not login yet, method will redirect to login page
 * @author Pham Xuan Huy
 */
package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author dmanh
 */
@WebFilter(filterName = "Authentication", urlPatterns = {"/carts", "/payment", "/profile", "/thank", "/foodList"})
public class Authentication implements Filter {

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();

        Account account = (Account) session.getAttribute("acc");
        if (account != null) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("login.jsp");

        }

    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

}
