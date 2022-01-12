package custom.liferay.dynamic.include.web.portlet;

import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = DynamicInclude.class

)

public class DynamicIncludePre implements DynamicInclude {

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = httpServletResponse.getWriter();
		printWriter.write("<h1>Pre content added from DynamicIncludePre</h1>");
	
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		// TODO Auto-generated method stub
		dynamicIncludeRegistry.register("custom.liferay.dynamic.include.web#view.jsp#pre");
	}

}
