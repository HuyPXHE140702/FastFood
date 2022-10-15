
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

/*
 * Authorize for user type Seller
 * If user is not type Seller, method will redirect to Error page
 * @author Pham Xuan Huy
 */
@WebFilter(filterName = "AuthorizationSeller", urlPatterns = {"/SellerFood", "/SellerOrder"})
public class SellerAuthorization implements Filter {

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
        if (account != null && account.getIsSeller() == 1) {
            chain.doFilter(request, response);

        } else {
            res.sendRedirect("error.jsp");
        }

    }

    /**
     * Return the filter configuration object for this filter.
     */
    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {
    }

    /**
     * Init method for this filter
     *
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {

    }

}
