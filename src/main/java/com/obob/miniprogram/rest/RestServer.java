//package com.obob.miniprogram.rest;
//
//import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
//import org.mortbay.jetty.Connector;
//import org.mortbay.jetty.Server;
//import org.mortbay.jetty.bio.SocketConnector;
//import org.mortbay.jetty.handler.ContextHandler;
//import org.mortbay.jetty.servlet.ServletHandler;
//import org.mortbay.jetty.servlet.ServletHolder;
//
//import com.alibaba.druid.support.http.StatViewServlet;
//
//
///**
// * 提供rest服务
// * @author obob
// *
// */
//public class RestServer {
//	private String context;
//
//	public String getContext() {
//		return context;
//	}
//
//	public void setContext(String context) {
//		this.context = context;
//	}
//
//	public int getPort() {
//		return port;
//	}
//
//	public void setPort(int port) {
//		this.port = port;
//	}
//
//	private int port;
//
//	/**
//	 * 启动查询接口服务 */
//	public void start() {
//		final Server server = new Server();
//		SocketConnector connector = new SocketConnector();
//		connector.setPort(port);
//		connector.setHost("127.0.0.1");
//		server.setConnectors(new Connector[] { connector });
//
//		ContextHandler ch = new ContextHandler(context);
//
//		ServletHandler servletHandler = new ServletHandler();
//		ServletHolder resteasyServlet = new ServletHolder(HttpServletDispatcher.class);
//		resteasyServlet.setInitParameter("javax.ws.rs.Application",
//				RestApplication.class.getName());
//		resteasyServlet.setInitOrder(0);
//		servletHandler.addServletWithMapping(new ServletHolder(StatViewServlet.class), "/druid/*");
//		servletHandler.addServletWithMapping(resteasyServlet, "/*");
//		ch.addHandler(servletHandler);
//		server.addHandler(ch);
//
//		Runtime.getRuntime().addShutdownHook(new Thread() {
//			@Override
//			public void run() {
//				try {
//					server.stop();
//				} catch (Exception e) {
//				}
//				server.destroy();
//			}
//		});
//
//		try {
//			server.start();
//			server.join();
//		} catch (Exception e) {
//			//TODO 记录日志
//		}
//	}
//}
