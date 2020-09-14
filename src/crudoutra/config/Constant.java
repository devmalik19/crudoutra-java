/*
 *   
 *   Author : Deepak Malik
 *   https://github.com/devmalik19/crudoutra-java
 *
 */

package crudoutra.config;

public class Constant 
{
    public static final int STATUS_400 = 400;
    public static final int STATUS_403 = 403;
    public static final int STATUS_404 = 404;
    public static final int STATUS_405 = 405;
    public static final int STATUS_422 = 422;
    public static final int STATUS_500 = 500;

    
    public static final String ERROR_400                =   "Invalid JSON";
    public static final String ERROR_404                =   "Wrong Endpoint";
    public static final String ERROR_405                =   "Wrong Method";
    public static final String ERROR_422                =   "Invalid Data";
    public static final String ERROR_500                =   "Internal Server Error";
    
    public static final String ERROR_DB_CONNECTION      =   "Database Connection Error";
    public static final String ERROR_DB                 =   "Database Error";
}
