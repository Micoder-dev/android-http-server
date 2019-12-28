/**************************************************
 * Android Web Server
 * Based on JavaLittleWebServer (2008)
 * <p/>
 * Copyright (c) Piotr Polak 2008-2015
 **************************************************/

package ro.polak.http;

import ro.polak.http.servlet.impl.HttpServletRequestImpl;
import ro.polak.http.servlet.impl.HttpServletResponseImpl;

import java.io.IOException;

/**
 * Interface allowing to load payload into the response.
 *
 * @author Piotr Polak piotr [at] polak [dot] ro
 * @since 201912
 */
public interface Loadable {

    /**
     * Loads the resource by URI, returns true if the resource was found or an error was served.
     *
     * @param path
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    void load(String path, HttpServletRequestImpl request, HttpServletResponseImpl response) throws IOException;

    /**
     * Shuts down the resource provider, closes all open resources.
     */
    void shutdown();
}
