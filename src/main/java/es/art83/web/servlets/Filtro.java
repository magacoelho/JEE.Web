package es.art83.web.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.logging.log4j.LogManager;

@WebFilter(urlPatterns = {"/HolaMundo", "/Parametros"})
public class Filtro implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void destroy() {
    }
// para saber el tiempo medio entre peticiones. (esto para las dos "rutas" mapeadas-- en WebFilter.
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        long antes = System.currentTimeMillis();
        
        chain.doFilter(request, response); // lamada progresa... reenvio?

        LogManager.getLogger(Filtro.class).info(
                "Tiempo de proceso(" + (System.currentTimeMillis() - antes) + " ms)");
    }
}
